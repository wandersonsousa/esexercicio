package com.esexercicio.esexercicio.controller;

import com.esexercicio.esexercicio.model.Post;
import com.esexercicio.esexercicio.model.User;
import com.esexercicio.esexercicio.repository.PostRepository;
import com.esexercicio.esexercicio.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    private PostRepository postRepository;

    @GetMapping
    public List<User> list() {
        return userRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody @NotNull User user){
        return userRepository.save(user);
    }
}
