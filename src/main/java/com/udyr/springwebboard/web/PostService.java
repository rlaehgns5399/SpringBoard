package com.udyr.springwebboard.web;

import com.udyr.springwebboard.web.posts.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class PostService implements ApplicationRunner {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void run(ApplicationArguments args) {
        Posts post = new Posts();
        post.setTitle("랜덤게임");
        post.setContent("랜덤게임인데용");
        post.setUsername("root");
        mongoTemplate.insert(post);
    }
}
