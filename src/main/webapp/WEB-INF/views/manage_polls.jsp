<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Manage Polls</title>
</head>
<body>
    <h2>Manage Polls</h2>
    
    <!-- Button to return to dashboard -->
    <a href="/admin/dashboard">Back to Dashboard</a>
    <br><br>

    <!-- Display the list of polls -->
    <table border="1">
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
                <td>
                    <!-- Update Form -->
                    <form action="/api/polls/update" method="post" style="display:inline;">
                        <input type="hidden" name="pollId" value="${poll.id}" />
                        <input type="text" name="title" placeholder="New Title" required />
                        <input type="text" name="description" placeholder="New Description" required />
                        <button type="submit">Update</button>
                    </form>

                    <!-- Delete Form -->
                    <form action="/api/polls/delete/${poll.id}" method="post" style="display:inline;">
                        <button type="submit">Delete</button>
                    </form>
                </td>
                <td>
                    	<form action="/results/admin/${poll.id}">
                    		<button type="submit">Result of this Vote</button>
                    	</form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
