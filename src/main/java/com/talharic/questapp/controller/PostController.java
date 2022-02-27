package com.talharic.questapp.controller;

import com.talharic.questapp.dto.PostCreateRequest;
import com.talharic.questapp.dto.PostUpdateRequest;
import com.talharic.questapp.model.Post;
import com.talharic.questapp.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/post")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts(@RequestParam Optional<Long> userId) {
        return postService.getAllPosts(userId);
    }

    @PostMapping
    public Post createOnePost(@RequestBody PostCreateRequest newPostRequest) {
        return postService.createOnePost(newPostRequest);
    }


    @GetMapping("/{postId}")
    public Post getOnePost(@PathVariable Long postId) {
        return postService.getOnePostById(postId);
    }

    @PutMapping("/{postId}")
    public Post updateOnePost(@PathVariable Long postId, @RequestBody PostUpdateRequest updatePost) {
        return postService.updateOnePostById(postId, updatePost);
    }

    @DeleteMapping("/{postId}")
    public void deleteOnePost(@PathVariable Long postId) {
        postService.deleteOnePostById(postId);
    }
}
