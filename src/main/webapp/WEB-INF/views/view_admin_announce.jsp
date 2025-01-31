<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin View Announcements</title>
</head>
<body>
    <h1>Latest Announcements</h1>
    <c:forEach var="announcement" items="${announcements}">
        <h3>${announcement.title}</h3>
        <p>${announcement.content}</p>
        <p><small>Posted on: ${announcement.createdAt}</small></p>
        <hr>
        <form action="/announcements/admin/update" method="post" style="display:inline;">
                        <input type="hidden" name="announcementId" value="${announcement.id}" />
                        <input type="text" name="title" placeholder="New Title" required />
                        <input type="text" name="content" placeholder="New Content" required />
                        <button type="submit">Update</button>
                    </form>
    </c:forEach>
    <br><br>
    <button onclick="location.href='/admin/dashboard'">Back to Dashboard</button>
</body>
</html>