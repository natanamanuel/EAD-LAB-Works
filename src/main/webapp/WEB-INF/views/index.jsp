<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Voting System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }
        header {
            background-color: #007bff;
            color: white;
            padding: 20px;
            text-align: center;
        }
        .container {
            margin: 20px auto;
            max-width: 800px;
            text-align: center;
        }
        .welcome {
            font-size: 24px;
            margin-bottom: 20px;
        }
        .buttons a, .buttons button {
            display: inline-block;
            margin: 10px;
            padding: 10px 20px;
            text-decoration: none;
            color: white;
            border-radius: 5px;
            font-size: 16px;
            border: none;
        }
        .btn-login {
            background-color: #007bff;
        }
        .btn-register {
            background-color: #28a745;
        }
        .btn-admin {
            background-color: #dc3545;
        }
        footer {
            background-color: #007bff;
            color: white;
            text-align: center;
            padding: 10px;
            margin-top: 20px;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to the Online Voting System</h1>
    </header>
    <div class="container">
        <p class="welcome">Empowering Democracy with Secure and Transparent Voting</p>
        <div class="buttons">
            <a href="/user/login" class="btn-login">User Login</a>
            <a href="/register" class="btn-register">Register</a>
            <a href="/admin/login" class="btn-admin">Admin Login</a>
        </div>
        <p>Upcoming Polls and Announcements:</p>
        <ul>
            <li>National Election - Starting on January 30th, 2025</li>
            <li>Community Feedback Poll - Open now!</li>
        </ul>
    </div>
    <footer>
        &copy; 2025 Online Voting System. All rights reserved.
    </footer>
</body>
</html>
