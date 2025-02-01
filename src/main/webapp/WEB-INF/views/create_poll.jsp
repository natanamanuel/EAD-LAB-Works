<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create New Poll</title>
    <link rel="stylesheet" href="/css/styles.css"> <!-- Link to external CSS file -->
    <script>
        function addOption() {
            const container = document.getElementById("optionsDiv");
            const input = document.createElement("input");
            input.setAttribute("type", "text");
            input.setAttribute("name", "options");
            input.required = true;
            input.placeholder = "Enter Option";
            container.appendChild(document.createElement("br")); // Add a line break
            container.appendChild(input);
        }
    </script>
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar">
        <div class="navbar-logo">
            <img src="/images/logo.jpg" alt="Logo"> <!-- Replace with your logo image -->
        </div>
        <div class="navbar-buttons">
            <a href="/admin/dashboard/manage_polls" class="btn-nav">Manage Polls</a>
            <a href="/admin/logout" class="btn-nav">Logout</a>
        </div>
    </nav>

    <!-- Header -->
    <header class="header">
        <h1>Create Poll</h1>
    </header>

    <!-- Create Poll Form -->
    <div class="form-container">
        <form action="/api/polls/create" method="post">
            <div class="form-group">
                <label for="title">Poll Title:</label>
                <input type="text" id="title" name="title" required>
            </div>
            <div class="form-group">
                <label for="description">Poll Description:</label>
                <textarea id="description" name="description" required></textarea>
            </div>
            <div class="form-group">
                <label for="start_date">Start Date:</label>
                <input type="date" id="start_date" name="startDate" required>
            </div>
            <div class="form-group">
                <label for="end_date">End Date:</label>
                <input type="date" id="end_date" name="endDate" required>
            </div>
            <div class="form-group">
                <label>Poll Options:</label>
                <div id="optionsDiv">
                    <input type="text" name="options" placeholder="Enter Option" required>
                </div>
                <button type="button" onclick="addOption()" class="btn-add-option">Add Option</button>
            </div>
            <div class="form-actions">
                <button type="submit" class="btn-submit">Create Poll</button>
                <button type="button" onclick="location.href='/admin/dashboard'" class="btn-back">Back to Dashboard</button>
            </div>
        </form>
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
