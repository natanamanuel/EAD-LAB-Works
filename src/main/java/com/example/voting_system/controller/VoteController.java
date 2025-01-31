package com.example.voting_system.controller;

import com.example.voting_system.service.VoteService;
import com.example.voting_system.model.User;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import com.example.voting_system.service.VoteService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;

//@RestController
//@RequestMapping("/api/votes")
//public class VoteController {
//
//    @Autowired
//    private VoteService voteService;
//
//    @PostMapping("/cast")
//    public ResponseEntity<?> castVote(@RequestParam Long pollId, @RequestParam Long optionId, @RequestParam Long userId) {
//        try {
//            voteService.castVote(pollId, optionId, userId);
//            return ResponseEntity.ok("Vote cast successfully.");
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
//        }
//    }
//}





@Controller
public class VoteController {

    private final VoteService voteService;

    @Autowired
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

//    @PostMapping("/user/vote")
//    public String castVote(@RequestParam Long pollId, @RequestParam Long optionId, HttpSession session, @ModelAttribute("user") User user) {
//    	String userIds = String.valueOf(user.getNationalId());
//    	Long userId = (Long) session.getAttribute(String.valueOf(user.getNationalId())) ;
//        //Long userId = (Long) session.getAttribute("id");
//        try {
//            voteService.castVote(pollId, optionId, userId);
//        } catch (Exception e) {
//            session.setAttribute("error", "You have already voted in this poll.");
//        }
//        return "redirect:/user/login/user_dashboard";
//    }
    
    
    @PostMapping("/user/vote")
    public String castVote(@RequestParam Long pollId, 
                            @RequestParam Long optionId, 
                            HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        
        // Check if user is logged in
        if (userId == null) {
            session.setAttribute("error", "User not logged in");
            return "redirect:/login";
        }

        try {
            voteService.castVote(pollId, optionId, userId);
        } catch (Exception e) {
            session.setAttribute("error", e.getMessage());
        }

        return "redirect:/user/login/user_dashboard";
    }

    
    
    
    
    
    
    
}
