package lt.code.academy.blogasnd.service;

import lt.code.academy.blogasnd.dto.BlogPost;
import lt.code.academy.blogasnd.repository.BlogPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    public BlogPostService(BlogPostRepository blogPostRepository){
        this.blogPostRepository = blogPostRepository;
    }

    public void createBlogPost(BlogPost blogPost) {
        blogPost.setId(UUID.randomUUID());

        blogPostRepository.create(blogPost);
    }

    public List<BlogPost> getBlogPosts(){
        return blogPostRepository.getBlogPosts();
    }
    public BlogPost getBlogPost(UUID, id) {
        return blogPostRepository.getBlogPost(id);
    };
}

