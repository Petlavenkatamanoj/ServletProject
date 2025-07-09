<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<head>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

       .form-wrapper {
           background-image: url('image/background.jpg');
           background-size: cover;
           background-position: center;
           background-repeat: no-repeat;
           display: flex;
           justify-content: center;
           align-items: center;
           padding: 60px 0;
           min-height: 90vh;
       }

        form {
            width:400px;
            display: flex;
            flex-direction: column;
            gap: 10px;
            padding: 20px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        label {
            font-weight: bold;
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
    <div class="form-wrapper">
    <form action="view" method="get">
        <label>Click to view database:</label>
        <input type="submit" value="View Data">
    </form>
    </div>


