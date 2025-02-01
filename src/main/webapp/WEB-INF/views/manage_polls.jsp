<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Polls</title>
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
            <a href="/admin/logout" class="btn-nav">Logout</a>
        </div>
    </nav>

    <!-- Header -->
    <header class="header">
        <h1>Manage Polls</h1>
    </header>

    <!-- Poll Management Table -->
    <div class="table-container">
        <table class="poll-table">
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Start Date</th>
                    <th>End Date</th>
                    <th>Actions</th>
                    <th>Vote Result</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="poll" items="${polls}">
                    <tr>
                        <td>${poll.title}</td>
                        <td>${poll.description}</td>
                        <td>${poll.startDate}</td>
                        <td>${poll.endDate}</td>
                        <td class="actions">
                            <!-- Update Form -->
                            <form action="/api/polls/update" method="post" class="inline-form">
                                <input type="hidden" name="pollId" value="${poll.id}" />
                                <input type="text" name="title" placeholder="New Title" required />
                                <input type="text" name="description" placeholder="New Description" required />
                                <button type="submit" class="btn-update">Update</button>
                            </form>

                            <!-- Delete Form -->
                            <form action="/api/polls/delete/${poll.id}" method="post" class="inline-form">
                                <button type="submit" class="btn-delete">Delete</button>
                            </form>
                        </td>
                        <td>
                            <!-- View Results Form -->
                            <form action="/results/admin/${poll.id}" class="inline-form">
                                <button type="submit" class="btn-results">View Results</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

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