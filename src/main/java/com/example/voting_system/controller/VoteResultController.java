package com.example.voting_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.voting_system.model.Poll;
import com.example.voting_system.model.PollOption;
import com.example.voting_system.service.PollOptionService;
import com.example.voting_system.service.PollServiceTwo;

import jakarta.servlet.http.HttpSession;

@Controller
public class VoteResultController {
	
	private final PollServiceTwo pollServiceTwo;
    private final PollOptionService pollOptionService;

    @Autowired
    public VoteResultController(PollServiceTwo pollServiceTwo, PollOptionService pollOptionService) {
        this.pollServiceTwo = pollServiceTwo;
        this.pollOptionService = pollOptionService;
    }
	
	@GetMapping("/polls/results/{pollId}")
    public String showVotingDashboard(Model model, HttpSession session, @PathVariable Long pollId) {
        List<Poll> polls = pollServiceTwo.getAllPolls();
        model.addAttribute("polls", polls);
        model.addAttribute(pollId);
        model.addAttribute("username", session.getAttribute("username"));
//        Long userId = (Long) session.getAttribute("id");
//        model.addAttribute(userId);
        
        List<PollOption> options = pollOptionService.getOptionsByPoll(pollId);
        model.addAttribute("options", options);
        int totalVotes = 0;
        for(PollOption option : options) {
        	totalVotes += option.getVotes();
        }
        model.addAttribute(totalVotes);
        
        return "voting_results";
    }
	
	@GetMapping("/results/admin/{pollId}")
    public String showAdminVotingDashboard(Model model, HttpSession session, @PathVariable Long pollId) {
        List<Poll> polls = pollServiceTwo.getAllPolls();
        model.addAttribute("polls", polls);
        model.addAttribute(pollId);
        model.addAttribute("username", session.getAttribute("username"));
//        Long userId = (Long) session.getAttribute("id");
//        model.addAttribute(userId);
        
        List<PollOption> options = pollOptionService.getOptionsByPoll(pollId);
        model.addAttribute("options", options);
        
        int totalVotesn = options.stream()
                .mapToInt(PollOption::getVotes)
                .sum();
        model.addAttribute(totalVotesn);
        
        int totalVotes = 0;
        for(PollOption option : options) {
        	totalVotes += option.getVotes();
        }
        model.addAttribute(totalVotes);
        
        return "admin_vote_result";
    }
}
