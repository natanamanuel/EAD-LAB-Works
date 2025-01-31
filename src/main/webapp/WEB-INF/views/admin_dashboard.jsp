<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <h1>Welcome to the Admin Dashboard</h1>
    <p>This is where you can create polls, view results, and manage announcements.</p>
    
    <!-- <nav>
        <a href="/admin/create_poll"><button>Create New Poll</button></a>
        <a href="/admin/manage_polls"><button>Manage Polls</button></a>
    </nav>  -->
    
    <button onclick="location.href='/admin/dashboard/create_poll'">Create New Poll</button>
    <button onclick="location.href='/admin/dashboard/manage_polls'">Manage Polls</button>
    <button onclick="location.href='/announcements/admin'">Create Announcements</button>
    <button onclick="location.href='/announcements/admin/view'">View Announcements</button>
    
</body>
</html>

