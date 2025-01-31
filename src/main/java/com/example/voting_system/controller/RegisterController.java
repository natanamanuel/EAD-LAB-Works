package com.example.voting_system.controller;

//import com.example.voting_system.model.User;
//import com.example.voting_system.repository.FaydaRepository;
//import com.example.voting_system.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.time.LocalDate;
//import java.time.Period;


//@Controller
//public class RegisterController {
//	
//	@Autowired
//    private FaydaRepository faydaRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping("/process_register")
//    public String processRegistration(
//            @RequestParam("nationalId") int nationalId,
//            @RequestParam("name") String name,
//            @RequestParam("age") int age,
//            @RequestParam("gender") String gender,
//            @RequestParam("email") String email,
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            Model model) {
//
//        // Check if nationalId exists in fayda table
//        var faydaRecord = faydaRepository.findById(nationalId);
//        if (faydaRecord.isEmpty()) {
//            model.addAttribute("error", "Invalid National ID. Please try again.");
//            return "register"; // Return to the registration page with an error
//        }
//
//        // If nationalId matches, calculate age from the date_of_birth
//        var fayda = faydaRecord.get();
//        LocalDate dob = fayda.getDateOfBirth();
//        int calculatedAge = Period.between(dob, LocalDate.now()).getYears();
//
//        if (calculatedAge != age) {
//            model.addAttribute("error", "Age does not match our records. Please try again.");
//            return "register";
//        }
//
//        // Save user details to the user table
//        User user = new User();
//        user.setNationalId(nationalId);
//        user.setName(name);
//        user.setAge(age);
//        user.setGender(gender);
//        user.setEmail(email);
//        user.setUsername(username);
//        user.setPassword(password); // Password should ideally be hashed before saving
//
//        userRepository.save(user);
//
//        // Redirect to success page or provide link to login
//        model.addAttribute("success", "Registration successful! You can now log in.");
//        model.addAttribute("loginLink", "/login");
//        return "register_success";
//    }
//}





import com.example.voting_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }
    
    // /process_register
    @PostMapping("/register")
    public String processRegistration(
            @RequestParam("nationalId") int nationalId,
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            @RequestParam("gender") String gender,
            @RequestParam("email") String email,
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        // Use the UserService to process registration
        String result = userService.registerUser(nationalId, name, age, gender, email, username, password);

        if (result.startsWith("Invalid") || result.startsWith("Age")) {
            model.addAttribute("error", result);
            return "register"; // Return to the registration page with the error
        }

        // Registration successful
        model.addAttribute("Registration successful! You can now log in.", result);
        model.addAttribute("loginLink", "/login");
        return "register_success";
    }
}

