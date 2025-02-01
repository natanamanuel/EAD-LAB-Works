<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Announcements</title>
    <link rel="stylesheet" href="/css/styles.css"> <!-- Link to your CSS file -->
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar">
        <div class="navbar-logo">
            <img src="/images/logo.jpg" alt="Logo"> <!-- Replace with your logo image -->
        </div>
        <div class="navbar-buttons">
            <a href="/user/login/user_dashboard" class="btn-nav">Dashboard</a>
            <a href="/user/login" class="btn-nav">Logout</a>
        </div>
    </nav>

    <!-- Header -->
    <header class="header">
        <h1>Welcome, ${username}!</h1>
    </header>

    <!-- Text Section -->
    <section class="text-section">
        <h2>Latest Announcements</h2>
    </section>

    <!-- Announcements Section -->
    <section class="announcements-section">
        <c:forEach var="announcement" items="${announcements}">
            <div class="announcement">
                <h3>${announcement.title}</h3>
                <p>${announcement.content}</p>
                <p class="announcement-date"><small>Posted on: ${announcement.createdAt}</small></p>
                <hr>
            </div>
        </c:forEach>
    </section>

    <!-- Return to Dashboard Button -->
    <br>
    <div class="dashboard-button">
        <a href="/user/login/user_dashboard" class="btn-main">Return to Dashboard</a>
    </div>
    <br>

    <!-- Logout Button -->
    <div class="logout-section">
        <a href="/user/login" class="btn-logout">Logout</a>
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