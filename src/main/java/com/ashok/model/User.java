<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 10px;
            color: #555;
        }
        input[type="text"],
        input[type="password"],
        input[type="email"],
        input[type="tel"],
        select {
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            padding: 10px 20px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>User Registration Form</h2>
        <form:form method="post" action="/submitForm" modelAttribute="user">
            <label for="uname">Username:</label>
            <form:input path="uname" id="uname" />

            <label for="pwd">Password:</label>
            <form:password path="pwd" id="pwd" />

            <label for="email">Email:</label>
            <form:input path="email" id="email" type="email" />

            <label for="phno">Phone Number:</label>
            <form:input path="phno" id="phno" type="tel" />

            <label for="gender">Gender:</label>
            <form:select path="gender" id="gender">
                <form:option value="">Select Gender</form:option>
                <form:option value="Male">Male</form:option>
                <form:option value="Female">Female</form:option>
                <form:option value="Other">Other</form:option>
            </form:select>

            <input type="submit" value="Submit" />
        </form:form>
    </div>
</body>
</html>

