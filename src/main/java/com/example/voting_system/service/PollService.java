package com.example.voting_system.service;

import com.example.voting_system.model.Poll;
import com.example.voting_system.model.PollOption;
import com.example.voting_system.repository.PollOptionRepository;
import com.example.voting_system.repository.PollRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollService {
	
	private PollRepository pollRepository;
    private PollOptionRepository pollOptionRepository;
    
    @Autowired
    public PollService(PollRepository pollRepository, PollOptionRepository pollOptionRepository) {
        this.pollRepository = pollRepository;
        this.pollOptionRepository = pollOptionRepository;
    }
    
    
    public void createPollWithOptions(Poll poll, List<String> options) {
        Poll savedPoll = pollRepository.save(poll);
        for (String optionText : options) {
            PollOption option = new PollOption(savedPoll, optionText);
            pollOptionRepository.save(option);
        }
    }
}
