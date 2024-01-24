package com.meteorastorebackend.controllers;

import com.meteorastorebackend.models.user.UserRequest;
import com.meteorastorebackend.models.user.UserResponse;
import com.meteorastorebackend.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping
    public ResponseEntity<UserResponse> cadastrar(@RequestBody UserRequest request) {

    }
}
