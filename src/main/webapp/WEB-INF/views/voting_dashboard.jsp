<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Voting Dashboard</title>
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

    <!-- Return to Dashboard Button -->
    <div class="dashboard-button">
        <a href="/user/login/user_dashboard" class="btn-main">Return to Dashboard</a>
    </div>

    <!-- Poll Information Section -->
    <section class="poll-info">
        <h2>Poll Information</h2>
        <c:forEach var="poll" items="${polls}">
            <c:if test="${pollId == poll.id}">
                <table class="poll-table">
                    <thead>
                        <tr>
                            <th>Poll ID</th>
                            <th>Title</th>
                            <th>Description</th>
                            <th>Start Date</th>
                            <th>End Date</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${poll.id}</td>
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

    <!-- Poll Options Section -->
    <section class="poll-options">
        <h2>Poll Options</h2>
        <table class="options-table">
            <thead>
                <tr>
                    <th>Options</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="option" items="${options}">
                    <tr>
                        <td>
                            <form action="/user/vote" method="post">
                                <input type="hidden" name="pollId" value="${pollId}" />
                                <input type="hidden" name="optionId" value="${option.id}" />
                                <button type="submit" class="btn-option">${option.optionText}</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
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
