<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Dashboard</title>
</head>
<body>
    <h1>Welcome, ${username}!</h1>
    
    <form action="/user/login/user_dashboard">
    <label>Click to See Available polls:</label>
    <button type="submit">See Polls</button>
    </form>
    
    <form action="/announcements/view">
    <label>Click to See Announcements:</label>
    <button type="submit">See Announcements</button>
    </form>
    
    <h2>Available Polls:</h2>
    <c:forEach var="poll" items="${polls}">
	    <table border="1">
	    	<thead>
	            <tr>
	                <th>Poll ID</th>
	                <th>Poll Title</th>
	                <th>Description</th>
	                <th>Vote</th>
	                <th>Vote Result</th>
	            </tr>
            </thead>
            <tbody>
            	<tr>
            		<td>${poll.id}</td>
                    <td>${poll.title}</td>
                    <td>${poll.description}</td>
                    <td>
                    	<form action="/user/login/user_dashboard/${poll.id}">
                    		<button type="submit">Click to Vote</button>
                    	</form>
                    </td>
                    <td>
                    	<form action="/polls/results/${poll.id}">
                    		<button type="submit">Result of this Vote</button>
                    	</form>
                    </td>
                </tr>
            </tbody>
	    </table>
	    <br><br>
    </c:forEach>

    <button onclick="location.href='/user/login'">Logout</button>
</body>
</html>

