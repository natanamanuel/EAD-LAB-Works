package com.example.voting_system.service;

import com.example.voting_system.model.PollOption;
import com.example.voting_system.model.Poll;
import com.example.voting_system.repository.PollOptionRepository;
import com.example.voting_system.repository.PollRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//import com.example.voting_system.model.PollOption;
//import com.example.voting_system.repository.PollOptionRepository;
//import com.example.voting_system.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

//import java.util.List;

@Service
public class PollOptionService {

//    private final PollOptionRepository pollOptionRepository;
//    private final PollRepository pollRepository;
    
    @Autowired
    private PollOptionRepository pollOptionRepository;

    @Autowired
    private PollRepository pollRepository;

    public PollOptionService(PollOptionRepository pollOptionRepository, PollRepository pollRepository) {
        this.pollOptionRepository = pollOptionRepository;
        this.pollRepository = pollRepository;
    }

    public PollOption addOption(Long pollId, String optionText) {
        Poll poll = pollRepository.findById(pollId)
                .orElseThrow(() -> new RuntimeException("Poll not found"));

        PollOption option = new PollOption(poll, optionText);
        return pollOptionRepository.save(option);
    }
    
 // Add multiple poll options for a poll
    public void addMultiplePollOptions(Long pollId, List<String> options) throws Exception {
//        if (!pollRepository.existsById(pollId)) {
//            throw new Exception("Poll with ID " + pollId + " does not exist.");
//        }

    	Poll poll = pollRepository.findById(pollId)
                .orElseThrow(() -> new RuntimeException("Poll not found"));
    	
//    	for (String optionText : options) {
//            PollOption option = new PollOption();
//            option.setPollId(pollId);
//            option.setOptionText(optionText);
//            pollOptionRepository.save(option);
//        }
    	
    	for (String optionText : options) {
            PollOption option = new PollOption(poll, optionText);
            pollOptionRepository.save(option);
        }
    }

    public List<PollOption> getOptionsByPoll(Long pollId) {
        return pollOptionRepository.findByPollId(pollId);
    }
    
    public void deleteOption(Long optionId) {
        pollOptionRepository.deleteById(optionId);
    }
}
