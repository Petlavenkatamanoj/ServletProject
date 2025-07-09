<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Response</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <%
        String message = (String) request.getAttribute("message");
        if (message != null) {
    %>
        <div class="alert alert-success text-center" role="alert">
            <%= message %>
        </div>
    <%
        } else {
    %>
        <div class="alert alert-danger text-center" role="alert">
            No message received.
        </div>
    <%
        }
    %>

    <div class="text-center mt-3">
        <a href="main.jsp" class="btn btn-primary">🔙 Back to Home</a>
    </div>
</div>
</body>
</html>