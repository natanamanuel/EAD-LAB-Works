<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login - Online Voting System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }
        .login-container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            border-radius: 8px;
        }
        .login-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #007bff;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        form label {
            font-weight: bold;
            margin-bottom: 5px;
        }
        form input {
            margin-bottom: 15px;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        form button {
            padding: 10px;
            font-size: 16px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        form button:hover {
            background-color: #0056b3;
        }
        .error {
            color: red;
            text-align: center;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Admin Login</h2>
        <form action="/admin/login" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" placeholder="Enter username" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter password" required>
            
            <button type="submit">Login</button>
        </form>
        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
    </div>
</body>
</html>
