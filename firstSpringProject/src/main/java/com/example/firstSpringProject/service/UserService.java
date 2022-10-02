package com.example.firstSpringProject.service;

import com.example.firstSpringProject.entity.UserEntity;
import com.example.firstSpringProject.exception.UserAlreadyExistException;
import com.example.firstSpringProject.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExistException {
        if(userRepo.findByUsername(user.getUsername()) != null){
            throw new UserAlreadyExistException("This user is already exist.");
        }
        return userRepo.save(user);

    }
}
