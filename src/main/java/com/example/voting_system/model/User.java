package com.example.voting_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class User {
	
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String nationalId;
//    private String name;
//    private int age;
//    private String gender;
//    private String email;
//    private String username;
//    private String password;
//
//    // Constructors
//    public User() {
//    }
//
//    public User(String nationalId, String name, int age, String gender, String email, String username, String password) {
//        this.nationalId = nationalId;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.email = email;
//        this.username = username;
//        this.password = password;
//    }
//
//    // Getters and Setters
//    // ...
	
	
	
	
	
//	 @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private Long id;
//
//	    @Column(unique = true, nullable = false)
//	    private String nationalId;
//
//	    @Column(nullable = false)
//	    private String name;
//
//	    @Column(nullable = false)
//	    private int age;
//
//	    @Column(nullable = false)
//	    private String gender;
//
//	    @Column(unique = true, nullable = false)
//	    private String email;
//
//	    @Column(unique = true, nullable = false)
//	    private String username;
//
//	    @Column(nullable = false)
//	    private String password;
//
//	    // Default constructor
//	    public User() {
//	    }
//
//	    // Parameterized constructor
//	    public User(String nationalId, String name, int age, String gender, String email, String username, String password) {
//	        this.nationalId = nationalId;
//	        this.name = name;
//	        this.age = age;
//	        this.gender = gender;
//	        this.email = email;
//	        this.username = username;
//	        this.password = password;
//	    }
//
//	    // Getters and Setters
//	    public Long getId() {
//	        return id;
//	    }
//
//	    public void setId(Long id) {
//	        this.id = id;
//	    }
//
//	    public String getNationalId() {
//	        return nationalId;
//	    }
//
//	    public void setNationalId(String nationalId) {
//	        this.nationalId = nationalId;
//	    }
//
//	    public String getName() {
//	        return name;
//	    }
//
//	    public void setName(String name) {
//	        this.name = name;
//	    }
//
//	    public int getAge() {
//	        return age;
//	    }
//
//	    public void setAge(int age) {
//	        this.age = age;
//	    }
//
//	    public String getGender() {
//	        return gender;
//	    }
//
//	    public void setGender(String gender) {
//	        this.gender = gender;
//	    }
//
//	    public String getEmail() {
//	        return email;
//	    }
//
//	    public void setEmail(String email) {
//	        this.email = email;
//	    }
//
//	    public String getUsername() {
//	        return username;
//	    }
//
//	    public void setUsername(String username) {
//	        this.username = username;
//	    }
//
//	    public String getPassword() {
//	        return password;
//	    }
//
//	    public void setPassword(String password) {
//	        this.password = password;
//	    }
//
//	    @Override
//	    public String toString() {
//	        return "User{" +
//	                "id=" + id +
//	                ", nationalId='" + nationalId + '\'' +
//	                ", name='" + name + '\'' +
//	                ", age=" + age +
//	                ", gender='" + gender + '\'' +
//	                ", email='" + email + '\'' +
//	                ", username='" + username + '\'' +
//	                ", password='******'" + // Mask the password for security
//	                '}';
//	    }
	
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary key field
	
	
	//@Id
    private int nationalId;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String username;
    private String password;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

}
