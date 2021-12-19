package com.esexercicio.esexercicio.controller;

import com.esexercicio.esexercicio.model.Post;
import com.esexercicio.esexercicio.repository.PostRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public List<Post> list(){
        return postRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post save(@RequestBody @NotNull Post post) {
        return postRepository.save(post);
    }
}
