package lt.code.academy.blogasnd.controller;

import lt.code.academy.blogasnd.dto.BlogPost;
import lt.code.academy.blogasnd.service.BlogPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/blogPosts")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @GetMapping
    public String showBlogPosts(Model model) {
        model.addAttribute("blogPosts", blogPostService.getBlogPosts());

        return "blogPosts";
    }

    @GetMapping("/create")
    public String openCreateBlogPostForm(Model model) {
        model.addAttribute("blogPost", new BlogPost());

        return "form/blogPost";
    }

    @PostMapping("/create")
    public String createPost(BlogPost blogPost, Model model) {
        model.addAttribute("blogPost", new BlogPost());
        model.addAttribute("message", "Blog Post created successfully");


        blogPostService.createBlogPost(blogPost);
        return "form/blogPost";
    }
    @GetMapping("/{id}")
    public String getBlogPostDetails(@PathVariable UUID id, Model model) {
        model.addAttribute("blogPost", blogPostService.getBlogPost(id));

return "blogPostDetails";
    }

    @GetMapping("/{id}/update")
    public String openUpdateBlogPostForm(@PathVariable UUID id, Model model) {
        model.addAttribute("blogPost", blogPostService.getBlogPost(id));

        return "form/blogPost";
    }

    @PostMapping("/{id}/update")
    public String updateProduct(BlogPost blogPost, Model model) {
        blogPostService.updateBlogPost(blogPost);
        model.addAttribute("blogPost", blogPostService.getBlogPosts());

        return "blogPosts";
    }

    @GetMapping("/{id}/delete")
    public String deleteBlogPost(@PathVariable UUID id, Model model) {
        blogPostService.deleteProduct(id);
        model.addAttribute("blogPost", blogPostService.getBlogPosts());

        return "blogPosts";
    }

}
