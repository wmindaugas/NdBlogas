package lt.code.academy.blogasnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class BlogPostController {

    @GetMapping("/create")
    public String openCreateBlogPostForm(Model model) {

        return "form/post";
    }
}
