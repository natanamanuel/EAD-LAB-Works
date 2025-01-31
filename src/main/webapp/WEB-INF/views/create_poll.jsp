<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create New Poll</title>
    <!-- <script>
        function addOptionField() {
            const optionsDiv = document.getElementById("optionsDiv");
            const newInput = document.createElement("input");
            newInput.type = "text";
            newInput.name = "options";
            newInput.placeholder = "Enter Option";
            optionsDiv.appendChild(document.createElement("br"));
            optionsDiv.appendChild(newInput);
        }
    </script>  -->
    
    <script>
	    function addOption() {
	        const container = document.getElementById("optionsDiv");
	        const input = document.createElement("input");
	        input.setAttribute("type", "text");
	        input.setAttribute("name", "options");
	        input.required = true;
	        optionsDiv.appendChild(input);
	    }
	</script>
</head>
<body>
    <h1>Create Poll</h1>
    <form action="/api/polls/create" method="post">
        <label for="title">Poll Title:</label>
        <input type="text" id="title" name="title" required><br>

        <label for="description">Poll Description:</label>
        <textarea id="description" name="description" required></textarea><br>

        <label for="start_date">Start Date:</label>
        <input type="date" id="start_date" name="startDate" required><br>

        <label for="end_date">End Date:</label>
        <input type="date" id="end_date" name="endDate" required><br>

        <div id="optionsDiv">
            <label>Poll Options:</label><br>
            <input type="text" name="options" placeholder="Enter Option" required>
        </div>
        <button type="button" onclick="addOption()">Add Option</button><br><br>

        <input type="submit" value="Create Poll" />
        <!--  <button type="submit">Create Poll</button> -->
        <button type="button" onclick="location.href='/admin/dashboard'">Back to Dashboard</button>
        
    </form>
</body>
</html>



