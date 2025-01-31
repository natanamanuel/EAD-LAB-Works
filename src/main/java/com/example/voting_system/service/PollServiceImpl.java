package com.example.voting_system.service;

import com.example.voting_system.model.Poll;
import com.example.voting_system.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PollServiceImpl implements PollServiceTwo {

    private final PollRepository pollRepository;

    @Autowired
    public PollServiceImpl(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }
    

    @Override
    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }
    

    @Override
    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }
    

    @Override
    public Poll updatePoll(Long id, Poll updatedPoll) {
        Optional<Poll> pollOptional = pollRepository.findById(id);
        if (pollOptional.isPresent()) {
            Poll poll = pollOptional.get();
            poll.setTitle(updatedPoll.getTitle());
            poll.setDescription(updatedPoll.getDescription());
            poll.setStartDate(updatedPoll.getStartDate());
            poll.setEndDate(updatedPoll.getEndDate());
            return pollRepository.save(poll);
        }
        throw new RuntimeException("Poll not found");
    }
    
    @Override
    public void updatePollTwo(Long pollId, String title, String description) {
        Poll poll = pollRepository.findById(pollId)
                                   .orElseThrow(() -> new RuntimeException("Poll not found"));
        poll.setTitle(title);
        poll.setDescription(description);
        pollRepository.save(poll);
    }
    
    

    @Override
    public void deletePoll(Long id) {
        pollRepository.deleteById(id);
    }
    
//    @Override
//    public void deletePoll(Long pollId) {
//        pollRepository.deleteById(pollId);
//    }
}
    


