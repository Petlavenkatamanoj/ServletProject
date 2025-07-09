<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Records</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h3 class="mb-4">Employee Records</h3>
    <%
        ArrayList<ArrayList<Object>> list = (ArrayList<ArrayList<Object>>) request.getAttribute("list");
        if (list != null && !list.isEmpty()) {
    %>
   <table class="table table-bordered table-striped">
       <thead class="table-dark">
           <tr>
               <th>ID</th>
               <th>Name</th>
               <th>Salary</th>
               <th>Department</th>
           </tr>
       </thead>
       <tbody>
           <% for (ArrayList<Object> row : list) { %>
               <tr>
                   <% for (Object col : row) { %>
                       <td><%= col %></td>
                   <% } %>
               </tr>
           <% } %>
       </tbody>
   </table>

    <% } else { %>
        <div class="alert alert-warning">No records found.</div>
    <% } %>

    <div class="mt-3">
        <a href="main.jsp" class="btn btn-primary">🔙 Back to Home</a>
    </div>
</div>
</body>
</html>
