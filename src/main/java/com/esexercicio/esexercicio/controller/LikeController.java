package com.esexercicio.esexercicio.controller;

import com.esexercicio.esexercicio.model.Like;
import com.esexercicio.esexercicio.model.Post;
import com.esexercicio.esexercicio.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    private LikeRepository likeRepository;

    @GetMapping
    public List<Like> list(){
        return likeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Like save(@RequestBody Like like) {
        return likeRepository.save(like);
    }
}
