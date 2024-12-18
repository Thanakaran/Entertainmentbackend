//package com.example.moviebackend.Controller;
//
//
//import com.example.moviebackend.Entity.User;
//import com.example.moviebackend.Service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Optional;
//
//@RestController
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/users/{id}")
//    public Optional<User> getUserById(@PathVariable String id) {
//        return userService.getUserById(id);
//    }
//}
