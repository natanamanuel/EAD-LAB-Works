package com.example.voting_system.controller;

import com.example.voting_system.model.Admin;
import com.example.voting_system.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.voting_system.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
    private AdminService adminService;

    // Display admin login page
    @GetMapping("/login")
    public String showAdminLogin() {
        return "admin_login"; // View name
    }

    // Handle admin login form submission
    @PostMapping("/login")
    public String handleAdminLogin(@RequestParam("username") String username,
                                   @RequestParam("password") String password,
                                   Model model) {
        boolean isAuthenticated = adminService.authenticateAdmin(username, password);

        if (isAuthenticated) {
            // Redirect to admin dashboard if authentication succeeds
            return "redirect:/admin/dashboard";
        } else {
            // Show error message on the login page
            model.addAttribute("error", "Invalid username or password.");
            return "admin_login";
        }
    }

    // Admin dashboard (example)
    @GetMapping("/dashboard")
    public String showAdminDashboard() {
        return "admin_dashboard"; // View for admin dashboard
    }

}
