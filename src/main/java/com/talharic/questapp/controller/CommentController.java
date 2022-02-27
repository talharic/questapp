package com.talharic.questapp.controller;

import com.talharic.questapp.dto.CommentCreateRequest;
import com.talharic.questapp.dto.CommentUpdateRequest;
import com.talharic.questapp.model.Comment;
import com.talharic.questapp.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/comment")
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> getAllComments(@RequestParam Optional<Long> userId,
                                        @RequestParam Optional<Long> postId) {
        return commentService.getAllCommentsWithParam(userId, postId);
    }

    @PostMapping
    public Comment createOneComment(@RequestBody CommentCreateRequest request) {
        return commentService.createOneComment(request);
    }

    @GetMapping("/{commentId}")
    public Comment getOneComment(@PathVariable Long commentId) {
        return commentService.getOneCommentById(commentId);
    }

    @PutMapping("/{commentId}")
    public Comment updateOneComment(@PathVariable Long commentId, @RequestBody CommentUpdateRequest request) {
        return commentService.updateOneCommentById(commentId, request);
    }

    @DeleteMapping("/{commentId}")
    public void deleteOneComment(@PathVariable Long commentId) {
        commentService.deleteOneCommentById(commentId);
    }
}
