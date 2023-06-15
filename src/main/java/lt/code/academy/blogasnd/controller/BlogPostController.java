package lt.code.academy.blogasnd.controller;

import lt.code.academy.blogasnd.dto.BlogPost;
import lt.code.academy.blogasnd.service.BlogPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("/details")
    public String getBlogPostDetails(@RequestParam UUID id, Model model) {
        model.addAttribute("blogPost", blogPostService.ge);

return "blogPostDetails";
    }

}
