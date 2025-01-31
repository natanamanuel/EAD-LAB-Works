package com.example.voting_system.controller;

import com.example.voting_system.model.Poll;
import com.example.voting_system.service.PollService;
import com.example.voting_system.service.PollServiceTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/polls")
public class PollController {

    private final PollService pollService;
    private PollServiceTwo pollServiceTwo;

    @Autowired
    public PollController(PollService pollService, PollServiceTwo pollServiceTwo) {
        this.pollService = pollService;
        this.pollServiceTwo = pollServiceTwo;
    }

//    @PostMapping("/create")
//    public Poll createPoll(@RequestBody Poll poll) {
//        return pollService.createPoll(poll);
//    }
    
    @PostMapping("/create")
    public String createPoll(@ModelAttribute Poll poll, @RequestParam("options") List<String> options) {
    	pollService.createPollWithOptions(poll, options);
        return "redirect:/admin/dashboard";
    }
    
    //ADDED
    @PostMapping("/update")
    public String updatePollTwo(@RequestParam Long pollId, 
                             @RequestParam String title, 
                             @RequestParam String description) {
    	pollServiceTwo.updatePollTwo(pollId, title, description);
        return "redirect:/admin/dashboard";
    }

    @PostMapping("/delete/{pollId}")
    public String deletePoll(@PathVariable Long pollId) {
    	pollServiceTwo.deletePoll(pollId);
        return "redirect:/admin/dashboard";
    }
    //ADDED


//    @GetMapping("/all")
//    public List<Poll> getAllPolls() {
//        return pollService.getAllPolls();
//    }
//
//    @PutMapping("/update/{id}")
//    public Poll updatePoll(@PathVariable Long id, @RequestBody Poll poll) {
//        return pollService.updatePoll(id, poll);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deletePoll(@PathVariable Long id) {
//        pollService.deletePoll(id);
//        return "Poll deleted successfully.";
//    }
}









