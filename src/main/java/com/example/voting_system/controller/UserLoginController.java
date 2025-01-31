package com.example.voting_system.controller;


import com.example.voting_system.model.User;
import com.example.voting_system.service.UserLoginService;
import com.example.voting_system.repository.UserLoginRepository;

import jakarta.servlet.http.HttpSession;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class UserLoginController {

    //@Autowired
    private UserLoginService userService;
    
    //@Autowired
    private UserLoginRepository userLoginRepository;
    
    @Autowired
    public UserLoginController(UserLoginRepository userLoginRepository) {
        this.userLoginRepository = userLoginRepository;
    }

    // Display the login page
    @GetMapping("/user/login")
    public String showLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    // Handle login form submission
//    @PostMapping("/user/login")
//    public String processLogin(@ModelAttribute("user") User user, Model model, HttpSession session) {
//        User authenticatedUser = userService.authenticate(user.getUsername(), user.getPassword());
//        if (authenticatedUser != null) {
//            model.addAttribute("username", authenticatedUser.getUsername());
//            session.setAttribute("userId", user.getId());
//            return "user_dashboard"; // Page after successful login
//        } else {
//            model.addAttribute("error", "Invalid username or password.");
//            return "login";
//        }
//    }
    
    @PostMapping("/user/login")
    public String loginUser(@RequestParam String username, 
                             @RequestParam String password, 
                             HttpSession session) {
        // Fetch user by username and password
        Optional<User> userOptional = userLoginRepository.findByUsernameAndPassword(username, password);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            session.setAttribute("userId", user.getId());  // Save userId in the session
            session.setAttribute("username", user.getUsername());
            //return "redirect:/user/dashboard";
            return "user_dashboard";
        } else {
            session.setAttribute("error", "Invalid credentials");
            //return "redirect:/login";
            return "login";
        }
    }

    
//    @PostMapping("/user/login")
//    public String loginUser(@RequestParam String username, 
//                             @RequestParam String password, 
//                             HttpSession session) {
//        User user = userService.validateUser(username, password);
//        if (user != null) {
//            session.setAttribute("userId", user.getId());
//            session.setAttribute("username", user.getUsername());
//            return "redirect:/user/dashboard";
//        } else {
//            session.setAttribute("error", "Invalid credentials");
//            return "redirect:/login";
//        }
//    }

}
