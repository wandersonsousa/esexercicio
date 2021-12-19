package com.esexercicio.esexercicio.controller;

import com.esexercicio.esexercicio.model.Comment;
import com.esexercicio.esexercicio.model.Like;
import com.esexercicio.esexercicio.repository.CommentRepository;
import com.esexercicio.esexercicio.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    public List<Comment> list(){
        return commentRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Comment save(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }
}
