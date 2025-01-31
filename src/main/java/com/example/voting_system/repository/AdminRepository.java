package com.example.voting_system.repository;

import com.example.voting_system.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
