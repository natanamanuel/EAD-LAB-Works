package com.example.voting_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.voting_system.model.Poll;
import com.example.voting_system.service.PollService;
import com.example.voting_system.service.PollServiceTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/dashboard")
public class AdminPageController {
	
	private final PollServiceTwo pollServiceTwo;

    @Autowired
    public AdminPageController(PollServiceTwo pollServiceTwo) {
        this.pollServiceTwo = pollServiceTwo;
    }

    @GetMapping("/manage_polls")
    public String showManagePollsPage(Model model) {
        List<Poll> polls = pollServiceTwo.getAllPolls();
        model.addAttribute("polls", polls);
        return "manage_polls";
    }
    
    // COMMENTED

//    @PostMapping("/api/polls/update")
//    public String updatePollTwo(@RequestParam Long pollId, 
//                             @RequestParam String title, 
//                             @RequestParam String description) {
//    	pollServiceTwo.updatePollTwo(pollId, title, description);
//        return "redirect:/admin/dashboard/manage_polls";
//    }
//
//    @PostMapping("/api/polls/delete/{pollId}")
//    public String deletePoll(@PathVariable Long pollId) {
//    	pollServiceTwo.deletePoll(pollId);
//        return "redirect:/admin/dashboard/manage_polls";
//    }
	
//	// Admin dashboard (example)
//    @GetMapping("/dashboard")
//    public String showAdminDashboard() {
//        return "admin_dashboard"; // View for admin dashboard
//    }
    
 // COMMENTED
	
	
	
//	@GetMapping("/dashboard")
//    public String dashboard() {
//        return "admin_dashboard";
//    }

    @GetMapping("/create_poll")
    public String createPollPage() {
        return "create_poll";
    }

//    @GetMapping("/manage_polls")
//    public String managePollsPage() {
//        return "manage_polls";
//    }
    
    
}


