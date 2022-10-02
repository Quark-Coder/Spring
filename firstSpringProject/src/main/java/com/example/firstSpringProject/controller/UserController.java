package com.example.firstSpringProject.controller;

import com.example.firstSpringProject.entity.UserEntity;
import com.example.firstSpringProject.exception.UserAlreadyExistException;
import com.example.firstSpringProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try {
            userService.registration(user);
            return ResponseEntity.ok("User saved succesfully.");
        } catch(UserAlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Server is not working....");
        }
    }

    @GetMapping
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok("Server is running." + "\n" + "Powered by Intelij IDEA");
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Server is not working....");
        }
    }
}
