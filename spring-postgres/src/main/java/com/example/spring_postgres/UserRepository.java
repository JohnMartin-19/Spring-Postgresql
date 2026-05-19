package com.example.spring_postgres;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.UserRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    
}