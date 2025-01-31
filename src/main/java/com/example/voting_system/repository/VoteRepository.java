package com.example.voting_system.repository;

import com.example.voting_system.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    Optional<Vote> findByPollIdAndUserId(Long pollId, Long userId);
}

//import com.example.voting_system.model.Vote;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface VoteRepository extends JpaRepository<Vote, Long> {
//    Optional<Vote> findByPollIdAndUserId(Long pollId, Long userId);
//}
