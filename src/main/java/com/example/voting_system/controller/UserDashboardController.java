package com.example.voting_system.controller;

import com.example.voting_system.model.Poll;
import com.example.voting_system.model.PollOption;
import com.example.voting_system.service.PollOptionService;
import com.example.voting_system.service.PollService;
import com.example.voting_system.service.PollServiceTwo;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserDashboardController {

    private final PollServiceTwo pollServiceTwo;
    private final PollOptionService pollOptionService;

    @Autowired
    public UserDashboardController(PollServiceTwo pollServiceTwo, PollOptionService pollOptionService) {
        this.pollServiceTwo = pollServiceTwo;
        this.pollOptionService = pollOptionService;
    }

    // /user/login /user/dashboard
    @GetMapping("/user/login/user_dashboard")
    public String showUserDashboard(Model model, HttpSession session) {
        List<Poll> polls = pollServiceTwo.getAllPolls();
        model.addAttribute("polls", polls);
        model.addAttribute("username", session.getAttribute("username"));
        
        
//        for (Poll poll : polls) {
//        	Long pollid = poll.getId();
//        	List<PollOption> options = pollOptionService.getOptionsByPoll(pollid);
//            model.addAttribute("options", options);
//        }
        
        return "user_dashboard";
    }
    
    @GetMapping("/user/login/user_dashboard/{pollId}")
    public String showVotingDashboard(Model model, HttpSession session, @PathVariable Long pollId) {
        List<Poll> polls = pollServiceTwo.getAllPolls();
        model.addAttribute("polls", polls);
        model.addAttribute(pollId);
        model.addAttribute("username", session.getAttribute("username"));
//        Long userId = (Long) session.getAttribute("id");
//        model.addAttribute(userId);
        
        List<PollOption> options = pollOptionService.getOptionsByPoll(pollId);
        model.addAttribute("options", options);
        
        return "voting_dashboard";
    }
    
    
    
}
