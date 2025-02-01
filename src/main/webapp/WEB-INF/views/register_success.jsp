<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Successful</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	
	<!-- Navbar -->
    <nav class="navbar">
        <div class="navbar-logo">
            <img src="/images/logo.jpg" alt="Logo"> <!-- Replace with your logo image -->
        </div>
        <div class="navbar-buttons">
            <a href="/user/login" class="btn-nav">User Login</a>
            <a href="/" class="btn-nav">Back to Home</a>
        </div>
    </nav>
    
    <header class="header">
        <h1>Registration Successful!</h1>
    </header>
	
    <section class="text-section">
        <p>Now that you have registered, click the link below to signin to your account.</p>
    </section>

    <!-- Return to Dashboard Button -->
    <div class="buttons-section">
        <a href="/user/login" class="btn-main">Go to Login</a>
    </div>
    
</body>
</html>
