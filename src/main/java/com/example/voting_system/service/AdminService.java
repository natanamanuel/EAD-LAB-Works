package com.example.voting_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.voting_system.repository.AdminRepository;
import com.example.voting_system.model.Admin;

@Service
public class AdminService {
	
	@Autowired
    private AdminRepository adminRepository;

    public boolean authenticateAdmin(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return true; // Authentication success
        }
        return false; // Authentication failure
    }
}
