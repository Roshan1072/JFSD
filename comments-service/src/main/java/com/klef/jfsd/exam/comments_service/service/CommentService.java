package com.klef.jfsd.exam.comments_service.service;


import com.klef.jfsd.exam.comments_service.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com/comments";

    public List<Comment> getAllComments() {
        Comment[] commentsArray = restTemplate.getForObject(JSON_PLACEHOLDER_URL, Comment[].class);
        return Arrays.asList(commentsArray);
    }
}
