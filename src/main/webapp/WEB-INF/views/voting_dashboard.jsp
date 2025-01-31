<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Voting Dashboard</title>
</head>
<body>
    <h1>Welcome, ${username}!</h1>
    
    <form action="/user/login/user_dashboard">
    <label>Return to Dashboard:</label>
    <button type="submit">See Polls</button>
    </form>
    
    <h2>Available Polls:</h2>
    <c:forEach var="poll" items="${polls}">
    	<c:if test="${pollId == poll.id}">
	    <table border="1">
	    	<thead>
	            <tr>
	                <th>Poll ID</th>
	                <th>Poll Title</th>
	                <th>Description</th>
	                <th>Options</th>
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
	    <br><br>
	    </c:if>
    </c:forEach>
    
    
	<table>
		<thead>
			<tr>OPTIONS</tr>
		</thead>
		<tbody>
			<c:forEach var="option" items="${options}">
				<tr>
					<td>
					<!-- /api/votes/cast -->
					<form action="/user/vote" method="post">
                    	<input type="hidden" name="pollId" value="${pollId}" />
                    	<input type="hidden" name="optionId" value="${option.id}" />
                    	<!-- <input type="hidden" name="userId" value="{userId}" /> -->
                    	<button type="submit">${option.optionText}</button>
                    </form>
                    </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br>
    <button onclick="location.href='/user/login'">Logout</button>
</body>
</html>

