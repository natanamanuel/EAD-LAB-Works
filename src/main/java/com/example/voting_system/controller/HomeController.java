package com.example.voting_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public String home() {
        return "index"; // Maps to src/main/webapp/WEB-INF/views/index.jsp
    }

}
