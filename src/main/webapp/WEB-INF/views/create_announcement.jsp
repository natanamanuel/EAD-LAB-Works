<!DOCTYPE html>
<html>
<head>
    <title>Create Announcement</title>
</head>
<body>
    <h1>Create a New Announcement</h1>
    <form action="/announcements/create" method="post">
        <label for="title">Title:</label>
        <input type="text" name="title" required><br><br>

        <label for="content">Content:</label>
        <textarea name="content" required></textarea><br><br>

        <button type="submit">Post Announcement</button>
    </form>
    <br><br>
    <button onclick="location.href='/admin/dashboard'">Back to Dashboard</button>
</body>
</html>
