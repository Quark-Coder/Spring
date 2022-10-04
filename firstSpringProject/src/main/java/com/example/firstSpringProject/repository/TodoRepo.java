package com.example.firstSpringProject.repository;

import com.example.firstSpringProject.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {

}
