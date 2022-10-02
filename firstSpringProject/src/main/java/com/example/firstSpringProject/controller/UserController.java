package com.example.firstSpringProject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok("Server is running." + "\n" + "Powered by Intelij IDEA");
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Server is not working....");
        }
    }
}
