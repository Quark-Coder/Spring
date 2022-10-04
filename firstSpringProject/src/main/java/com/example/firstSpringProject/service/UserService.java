package com.example.firstSpringProject.service;

import com.example.firstSpringProject.entity.UserEntity;
import com.example.firstSpringProject.exception.UserAlreadyExistException;
import com.example.firstSpringProject.exception.UserNotFoundException;
import com.example.firstSpringProject.model.User;
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

    public User getOne(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if(user == null){
            throw new UserNotFoundException("User not found.");
        }
        return User.toModel(user);
    }

    public Long delete(Long id){
        userRepo.deleteById(id);
        return id;
    }
}
