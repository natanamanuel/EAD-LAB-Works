package com.example.voting_system.repository;

import com.example.voting_system.model.Poll;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {
	// ADDED
//	@EntityGraph(attributePaths = {"pollOptions"})
//    List<Poll> findAll();
	// ADDED
}
