package com.example.voting_system.service;



import com.example.voting_system.model.Poll;
import java.util.List;

public interface PollServiceTwo {

    Poll createPoll(Poll poll);

    List<Poll> getAllPolls();

    Poll updatePoll(Long id, Poll poll);
    
    void updatePollTwo(Long pollId, String updateTitle, String updateDescription);

    void deletePoll(Long id);
}
