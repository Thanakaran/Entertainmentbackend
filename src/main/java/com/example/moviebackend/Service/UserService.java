//package com.example.moviebackend.Service;
//
//import com.example.moviebackend.Entity.User;
//import com.example.moviebackend.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public Optional<User> getUserById(String id) {
//        return userRepository.findById(id);
//    }
//}