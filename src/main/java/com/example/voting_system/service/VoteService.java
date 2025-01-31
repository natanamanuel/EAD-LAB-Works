package com.example.voting_system.service;

import com.example.voting_system.model.PollOption;
import com.example.voting_system.model.Vote;
import com.example.voting_system.repository.PollOptionRepository;
import com.example.voting_system.repository.PollRepository;
import com.example.voting_system.repository.VoteRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import com.example.voting_system.model.Vote;
//import com.example.voting_system.repository.VoteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Autowired
    private PollRepository pollRepository;

    @Autowired
    private PollOptionRepository pollOptionRepository;

    public void castVote(Long pollId, Long optionId, Long userId) throws Exception {
        if (!pollRepository.existsById(pollId)) {
            throw new Exception("Poll with ID " + pollId + " does not exist.");
        }
        if (!pollOptionRepository.existsById(optionId)) {
            throw new Exception("Poll option with ID " + optionId + " does not exist.");
        }
        if (voteRepository.findByPollIdAndUserId(pollId, userId).isPresent()) {
            throw new Exception("User has already voted in this poll.");
        }

        Vote vote = new Vote(pollId, optionId, userId);
        voteRepository.save(vote);
        
        
     // Increment vote count in the poll option table
        Optional<PollOption> selectedOption = pollOptionRepository.findById(optionId);
        PollOption option = selectedOption.get();
        option.setVotes(option.getVotes() + 1);
        pollOptionRepository.save(option);
    }
}




//@Service
//public class VoteService {
//
//    @Autowired
//    private VoteRepository voteRepository;
//
//    public void castVote(Long pollId, Long optionId, Long userId) {
//        if (voteRepository.findByPollIdAndUserId(pollId, userId).isPresent()) {
//            throw new RuntimeException("User has already voted in this poll.");
//        }
//
//        Vote vote = new Vote(pollId, optionId, userId);
//        voteRepository.save(vote);
//    }
//}

