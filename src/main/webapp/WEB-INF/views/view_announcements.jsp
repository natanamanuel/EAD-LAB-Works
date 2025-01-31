<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Announcements</title>
</head>
<body>
    <h1>Latest Announcements</h1>
    <c:forEach var="announcement" items="${announcements}">
        <h3>${announcement.title}</h3>
        <p>${announcement.content}</p>
        <p><small>Posted on: ${announcement.createdAt}</small></p>
        <hr>
    </c:forEach>
    <br><br>
    <button onclick="location.href='/user/login/user_dashboard'">Back to Dashboard</button>
</body>
</html>
