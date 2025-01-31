<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Voting Result</title>
</head>
<body>
    <h1>${username}!</h1>
    <h2>Here you see the current result of the vote you selected</h2>
    
    <form action="/user/login/user_dashboard">
    <label>Return to Dashboard:</label>
    <button type="submit">Back to Polls</button>
    </form>
    
    <h2>Poll Result</h2>
    <c:forEach var="poll" items="${polls}">
    	<c:if test="${pollId == poll.id}">
	    <table border="1">
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
	    <br><br>
	    </c:if>
    </c:forEach>
    
    
	<table>
		<thead>
			<tr>
				<td>OPTIONS</td>
				<td>Number of votes</td>
				<td>Vote Percentage</td>
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
					<!-- <td>${(option.votes / totalVotes) * 100}%</td> -->
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br>
    <button onclick="location.href='/user/login'">Logout</button>
</body>
</html>

