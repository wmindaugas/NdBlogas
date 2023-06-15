package lt.code.academy.blogasnd.repository;

import lt.code.academy.blogasnd.dto.BlogPost;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class BlogPostRepository {
    private final Map<UUID, BlogPost> blogPosts;

    public BlogPostRepository() {
        blogPosts = new HashMap<>();
    }
    public void create(BlogPost blogPost) {
        blogPosts.put(blogPost.getId(), blogPost);
    }

    public List<BlogPost> getBlogPosts () {
        return blogPosts.values()
                .stream()
                .toList();

    }

    public BlogPost getBlogPost(UUID id) {
        return blogPosts.get(id);
    }
}
