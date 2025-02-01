<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="/css/styles.css"> <!-- Link to external CSS file -->
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar">
        <div class="navbar-logo">
            <img src="/images/logo.jpg" alt="Logo"> <!-- Replace with your logo image -->
        </div>
        <div class="navbar-buttons">
            <a href="/admin/dashboard/create_poll" class="btn-nav">Create Poll</a>
            <a href="/admin/dashboard/manage_polls" class="btn-nav">Manage Polls</a>
            <a href="/admin/logout" class="btn-nav">Logout</a>
        </div>
    </nav>

    <!-- Header -->
    <header class="header">
        <h1>Admin Dashboard</h1>
    </header>

    <!-- Welcome Text -->
    <section class="text-section">
        <p>Welcome, Admin!</p>
    </section>

    <!-- Buttons Section -->
    <section class="buttons-section">
        <div class="button-container">
            <p>Create a new poll for users to participate in.</p>
            <a href="/admin/dashboard/create_poll" class="btn-main">Create Poll</a>
        </div>
        <div class="button-container">
            <p>Manage existing polls, edit, or delete them.</p>
            <a href="/admin/dashboard/manage_polls" class="btn-main">Manage Polls</a>
        </div>
        <div class="button-container">
            <p>Create new announcements for users.</p>
            <a href="/announcements/admin" class="btn-main">Create Announcements</a>
        </div>
        <div class="button-container">
            <p>View and manage existing announcements.</p>
            <a href="/announcements/admin/view" class="btn-main">View Announcements</a>
        </div>
    </section>

    <!-- Logout Button -->
    <div class="logout-section">
        <a href="/admin/login" class="btn-logout">Logout</a>
    </div>

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