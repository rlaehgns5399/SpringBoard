package com.udyr.springwebboard.web.posts;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="notify")
public class Posts{

    private String title;
    private String content;
    private String username;

}