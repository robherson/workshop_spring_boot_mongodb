package com.robherson.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robherson.workshopmongo.domain.User;
import com.robherson.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){

        return userRepository.findAll();
        
    }
    
}
