<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Dashboard</title>
    <link rel="stylesheet" href="/css/styles.css"> <!-- Link to your CSS file -->
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar">
        <div class="navbar-logo">
            <img src="/images/logo.jpg" alt="Logo">
        </div>
        <div class="navbar-buttons">
            <a href="/announcements/view" class="btn-nav">Announcements</a>
            <a href="/user/login" class="btn-nav">Logout</a>
        </div>
    </nav>

    <!-- Header -->
    <header class="header">
        <h1>Welcome, ${username}!</h1>
    </header>

    <!-- Introduction Text -->
    <section class="introduction">
        <p>
            As a registered user, you can:
            <ul>
                <li>Vote on available polls.</li>
                <li>View the results of polls you've participated in.</li>
                <li>Stay updated with the latest announcements.</li>
            </ul>
        </p>
    </section>

    <!-- Buttons Section -->
    <section class="buttons-section">
        <a href="/user/login/user_dashboard" class="btn-main">See Polls</a>
        <a href="/announcements/view" class="btn-main">See Announcements</a>
    </section>

    <!-- Available Polls Section -->
    <section class="polls-section">
        <h2>Available Polls</h2>
        <c:forEach var="poll" items="${polls}">
            <div class="poll-container">
                <h3>${poll.title}</h3>
                <p>${poll.description}</p>
                <div class="poll-actions">
                    <a href="/user/login/user_dashboard/${poll.id}" class="btn-poll">Vote</a>
                    <a href="/polls/results/${poll.id}" class="btn-poll">View Results</a>
                </div>
            </div>
        </c:forEach>
    </section>

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
