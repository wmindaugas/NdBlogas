package lt.code.academy.blogasnd.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class BlogPost {
    private UUID id;
    private String title;
    private String description;
    private String category;

}