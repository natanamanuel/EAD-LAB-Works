<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>National Dialogue Commission</title>
    <link rel="stylesheet" href="/css/styles.css"> <!-- Link to external CSS file -->
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar">
        <div class="navbar-logo">
            <img src="/images/logo.jpg" alt="Logo"> <!-- Replace with your logo image -->
        </div>
        <div class="navbar-buttons">
            <a href="/user/login" class="btn-nav">User Login</a>
            <a href="/register" class="btn-nav">Register</a>
            <a href="/admin/login" class="btn-nav">Admin</a>
        </div>
    </nav>

    <!-- Header -->
    <header class="header">
        <h1>Ethiopian National Dialogue Commission</h1>
    </header>

    <!-- Introduction Section -->
    <section class="introduction">
        <p>
            Welcome to the Ethiopian National Dialogue Commission's Online Polling and Announcement System. 
            This platform empowers citizens to participate in the national dialogue by making secure and transparent voting processes. 
            Register to be part of this commission, log in to access polls, and stay updated with upcoming events and announcements.
        </p>
    </section>

    <!-- Buttons Section with Descriptive Text -->
    <section class="buttons-section">
        <div class="button-container">
            <p>Are you a citizen of Ethiopia with a National ID? Register to be part of the National Dialogue.</p>
            <br>
            <a href="/register" class="btn-main">Register</a>
        </div>
        <div class="button-container">
            <p>Already registered? Log in to access your account and participate in polls.</p>
            <br>
            <a href="/user/login" class="btn-main">User Login</a>
        </div>
        <div class="button-container">
            <p>For Administrators Only.</p>
            <br>
            <a href="/admin/login" class="btn-main">Admin Login</a>
        </div>
    </section>

    <!-- Upcoming, Announcements, and Polls Section -->
    <section class="upcoming-section">
        <h2>Upcoming Events</h2>
        <ul>
            <li>National Election - Starting on January 30th, 2025</li>
            <li>Community Feedback Poll - Open now!</li>
        </ul>

        <h2>Announcements</h2>
        <ul>
            <li>New poll on community development initiatives.</li>
            <li>Results for the regional election will be announced soon.</li>
        </ul>

        <h2>Polls</h2>
        <ul>
            <li>Vote on the new education policy.</li>
            <li>Participate in the health services survey.</li>
        </ul>
    </section>

    <!-- Footer -->
    <footer class="footer">
        <div class="footer-social">
            <h3>Follow Us</h3>
            <a href="https://www.facebook.com/EthioNDC">Facebook</a>
            <a href="https://twitter.com/EthioNDC">Twitter</a>
            <a href="https://t.me/EtNationalDialogue">Telegram</a>
            <a href="https://www.tiktok.com/@ethiondc">Tiktok</a>
            <a href="https://youtube.com/@ENDC317?si=NYZbzI6KRteGRDQL">YouTube</a>
        </div>
        <div class="footer-contact">
            <h3>Contact Us</h3>
            <p>Phone: +251-111-261196</p>
            <p>Phone: +251-111-261428</p>
            <p>Email: ethiopianndc@gmail.com</p>
        </div>
        <div class="footer-copyright">
            <p>&copy; 2025 Ethiopian National Dialogue Commission. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>