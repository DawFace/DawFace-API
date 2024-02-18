package com.daw.face.endpoint;

import com.daw.face.repository.model.User;
import com.daw.face.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
    public UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }
}
