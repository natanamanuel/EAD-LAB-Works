package com.example.voting_system.service;

//import com.example.voting_system.model.User;
//import com.example.voting_system.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//	
//	 @Autowired
//	    private UserRepository userRepository;
//
//	    public boolean authenticate(String username, String password) {
//	        User user = userRepository.findByUsername(username);
//	        return user != null && user.getPassword().equals(password);
//	    }
//
//	    public boolean register(String nationalId, String name, int age, String gender, String email, String username, String password) {
//	        // Check if the National ID is valid (for simplicity, assume all IDs are valid here)
//	        if (userRepository.existsByNationalId(nationalId)) {
//	            return false; // National ID is already registered
//	        }
//
//	        // Save the user to the database
//	        User user = new User(nationalId, name, age, gender, email, username, password);
//	        userRepository.save(user);
//	        return true;
//	    }
//
//
//}




import com.example.voting_system.model.Fayda;
import com.example.voting_system.model.User;
import com.example.voting_system.repository.FaydaRepository;
import com.example.voting_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private FaydaRepository faydaRepository;

    @Autowired
    private UserRepository userRepository;

    /**
     * Validates the user's national ID against the Fayda table.
     * If valid, saves the user to the database.
     *
     * @param nationalId the national ID of the user
     * @param name the full name of the user
     * @param age the age of the user
     * @param gender the gender of the user
     * @param email the email of the user
     * @param username the username of the user
     * @param password the password of the user
     * @return a success message if registration is successful, otherwise an error message
     */
    public String registerUser(int nationalId, String name, int age, String gender, String email, String username, String password) {
        // Check if the nationalId exists in the Fayda table
        Optional<Fayda> faydaRecord = faydaRepository.findById(nationalId);

        if (faydaRecord.isEmpty()) {
            return "Invalid National ID. Please try again.";
        }

        // Validate the age using the date of birth from the Fayda table
        Fayda fayda = faydaRecord.get();
        LocalDate dob = fayda.getDateOfBirth();
        int calculatedAge = Period.between(dob, LocalDate.now()).getYears();

        if (calculatedAge != age) {
            return "Age does not match our records. Please try again.";
        }

        // Save user details to the user table
        User user = new User();
        user.setNationalId(nationalId);
        user.setName(name);
        user.setAge(age);
        user.setGender(gender);
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password); // Password should be hashed in a real application

        userRepository.save(user);

        return "Registration successful! You can now log in.";
    }
}
