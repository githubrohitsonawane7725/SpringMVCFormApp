<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Ashok IT School</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
            text-align: center;
        }
        h2 {
            color: #333;
            margin-top: 50px;
        }
        form {
            margin-top: 20px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }
        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 250px;
            padding: 10px;
            margin-bottom: 15px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2>Welcome to Ashok IT School</h2>
    <p>Unlock your potential with cutting-edge technology!</p>
    <form id="registrationForm">
        <label for="uname">Username:</label>
        <input type="text" id="uname" name="uname" required><br>
        <label for="pwd">Password:</label>
        <input type="password" id="pwd" name="pwd" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        <input type="submit" value="Register">
    </form>

    <script>
        document.getElementById("registrationForm").addEventListener("submit", function(event) {
            event.preventDefault(); // Prevent form submission
            // Retrieve form data
            var formData = new FormData(event.target);
            var formDataObject = {};
            formData.forEach(function(value, key){
                formDataObject[key] = value;
            });
            // Perform any additional validation here if needed
            // For now, just log the data to console
            console.log(formDataObject);
            // You can now send this data to your server using AJAX or perform any other action
        });
    </script>
</body>
</html>


	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", email=" + email + "]";
	}

}
