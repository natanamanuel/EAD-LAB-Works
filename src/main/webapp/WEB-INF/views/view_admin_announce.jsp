<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin View Announcements</title>
    <link rel="stylesheet" href="/css/styles.css"> <!-- Link to external CSS file -->
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar">
        <div class="navbar-logo">
            <img src="/images/logo.jpg" alt="Logo"> <!-- Replace with your logo image -->
        </div>
        <div class="navbar-buttons">
            <a href="/announcements/admin" class="btn-nav">Create Announcement</a>
            <a href="/admin/logout" class="btn-nav">Logout</a>
        </div>
    </nav>

    <!-- Header -->
    <header class="header">
        <h1>List of Posted Announcements</h1>
    </header>

    <!-- Announcements List -->
    <section class="announcements-list">
        <c:forEach var="announcement" items="${announcements}">
            <div class="announcement">
                <h3>${announcement.title}</h3>
                <p>${announcement.content}</p>
                <p class="announcement-date"><small>Posted on: ${announcement.createdAt}</small></p>
                <div class="announcement-actions">
                    <!-- Update Form -->
                    <form action="/announcements/admin/update" method="post" class="inline-form">
                        <input type="hidden" name="announcementId" value="${announcement.id}" />
                        <input type="text" name="title" placeholder="New Title" required />
                        <input type="text" name="content" placeholder="New Content" required />
                        <button type="submit" class="btn-update">Update</button>
                    </form>

                    <!-- Delete Form -->
                    <form action="/announcements/admin/delete/${announcement.id}" method="post" class="inline-form">
                        <button type="submit" class="btn-delete">Delete Post</button>
                    </form>
                </div>
                <hr>
            </div>
        </c:forEach>
    </section>

    <!-- Back to Dashboard Button -->
    <div class="back-button">
        <a href="/admin/dashboard" class="btn-back">Back to Dashboard</a>
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