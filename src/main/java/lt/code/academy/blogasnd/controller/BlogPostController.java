package lt.code.academy.blogasnd.controller;

import lt.code.academy.blogasnd.dto.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogPosts")
public class BlogPostController {

    @GetMapping("/create")
    public String openCreateBlogPostForm(Model model) {
        model.addAttribute("blogPost", new BlogPost());

        return "form/blogPost";
    }

    @PostMapping("/create")
    public String createPost(BlogPost blogPost) {
        return "blogPosts";
    }
}
