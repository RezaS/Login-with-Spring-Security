package com.example.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("login")
    public ResponseEntity<String> login(User user) {
        return ResponseEntity.ok("Welcome");
    }
}