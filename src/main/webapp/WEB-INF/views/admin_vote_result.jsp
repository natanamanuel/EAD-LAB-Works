<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Voting Result</title>
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
        <h1>Selected Vote Result</h1>
    </header>

    <!-- Poll Information Section -->
    <section class="poll-info">
        <h2>Poll Information</h2>
        <c:forEach var="poll" items="${polls}">
            <c:if test="${pollId == poll.id}">
                <table class="poll-table">
                    <thead>
                        <tr>
                            <th>Poll Title</th>
                            <th>Description</th>
                            <th>Start Date</th>
                            <th>End Date</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${poll.title}</td>
                            <td>${poll.description}</td>
                            <td>${poll.startDate}</td>
                            <td>${poll.endDate}</td>
                        </tr>
                    </tbody>
                </table>
            </c:if>
        </c:forEach>
    </section>

    <!-- Poll Result Section -->
    <section class="poll-results">
        <h2>Poll Results</h2>
        <table class="results-table">
            <thead>
                <tr>
                    <th>Options</th>
                    <th>Number of Votes</th>
                    <th>Vote Percentage</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="option" items="${options}">
                    <tr>
                        <td>${option.optionText}</td>
                        <td>${option.votes}</td>
                        <td>
                            <c:choose>
                                <c:when test="${totalVotes > 0}">
                                    ${(option.votes / totalVotes) * 100}%
                                </c:when>
                                <c:otherwise>
                                    0%
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
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
