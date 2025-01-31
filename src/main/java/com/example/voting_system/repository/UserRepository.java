package com.example.voting_system.repository;

import com.example.voting_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


//public interface UserRepository extends JpaRepository<User, Long> {
//    User findByUsername(String username);
//    boolean existsByNationalId(String nationalId);
//}



public interface UserRepository extends JpaRepository<User, Integer> {
}
