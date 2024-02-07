package com.daw.face.endpoint.rest.controller.health;

import com.daw.face.repository.model.User;
import com.daw.face.service.event.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    public UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> findAll(){
        return userService.findAll();
    }
}
