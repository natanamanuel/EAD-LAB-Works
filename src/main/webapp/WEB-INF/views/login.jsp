<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Login</title>
    <link rel="stylesheet" href="/css/styles.css"> <!-- Link to your CSS file -->
   
</head>
<body>
    <div class="container">
        <h2>User Login</h2>
        
        <!--  <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    	</c:if> -->
    	
        <form action="/user/login" method="post">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit">Login</button>
        </form>
        <p style="color:red;">${errorMessage}</p> <!-- Show error message if login fails -->
        <br>
        <p>Don't have an account? <a href="/register">Register here</a>.</p>
    </div>
</body>
</html>




    
    
        
    

