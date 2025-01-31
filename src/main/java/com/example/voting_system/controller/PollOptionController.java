package com.example.voting_system.controller;

import com.example.voting_system.model.PollOption;
import com.example.voting_system.service.PollOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/polls/options")
public class PollOptionController {
	
	@Autowired
    private PollOptionService pollOptionService;

//    private final PollOptionService pollOptionService;

    public PollOptionController(PollOptionService pollOptionService) {
        this.pollOptionService = pollOptionService;
    }

    @PostMapping("/add/{pollId}")
    public PollOption addOption(@PathVariable Long pollId, @RequestBody String optionText) {
        return pollOptionService.addOption(pollId, optionText);
    }
    
 // Bulk add poll options for a specific poll
    @PostMapping("/bulk-add/{pollId}")
    public ResponseEntity<?> addPollOptions(@PathVariable Long pollId, @RequestBody List<String> options) {
        try {
            pollOptionService.addMultiplePollOptions(pollId, options);
            return ResponseEntity.ok("Poll options added successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error adding poll options: " + e.getMessage());
        }
    }

    @GetMapping("/list/{pollId}")
    public List<PollOption> getOptionsByPoll(@PathVariable Long pollId) {
        return pollOptionService.getOptionsByPoll(pollId);
    }

    @DeleteMapping("/delete/{optionId}")
    public void deleteOption(@PathVariable Long optionId) {
        pollOptionService.deleteOption(optionId);
    }
}

