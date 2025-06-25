<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
 <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #f4f4f4;
            background-image: url('image/background.jpg');
             background-size: cover;
             background-position: center;
             background-repeat: no-repeat;
             font-family: Arial, sans-serif;
        }

        form {
            width: 400px;
            padding: 20px;
            display: flex;
            flex-direction: column;
            gap: 15px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        input[type="text"],
        input[type="number"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            padding: 10px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<form action="update" method="/get">
<label>Enter a Id:</label>
<input type="number" name="id">
<label>Enter a name:</label>
<input type="text" name="name">
<label>Enter a salary:</label>
<input type="text" name="salary">
<label>Enter a department:</label>
<input type="text" name="department">
Enter a Submit:<input type="submit">
</form>
</body>
</html>