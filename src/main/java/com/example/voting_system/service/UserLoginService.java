package com.example.voting_system.service;

import com.example.voting_system.model.User;
import com.example.voting_system.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class UserLoginService {
	
	@Autowired
    private UserLoginRepository userRepository;

    // Authenticate user by checking credentials
    public User authenticate(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password).orElse(null);
    }
}

