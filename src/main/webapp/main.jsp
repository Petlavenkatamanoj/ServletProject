<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dynamic Loader</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">MyApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon bg-light"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link" href="#" onclick="loadPage('index.jsp'); return false;">Add</a>
                <a class="nav-link" href="#" onclick="loadPage('update.jsp'); return false;">Update</a>
                <a class="nav-link" href="#" onclick="loadPage('delete.jsp'); return false;">Delete</a>
                <a class="nav-link" href="#" onclick="loadPage('view.jsp'); return false;">View</a>
            </div>
        </div>
    </div>
</nav>
<div class="container" id="content-area">
    <p class="text-muted">Click on a menu item to load content here...</p>
</div>
<script>
    function loadPage(page) {
        fetch(page)
            .then(response => {
                if (!response.ok) throw new Error("Page not found");
                return response.text();
            })
            .then(html => {
                document.getElementById("content-area").innerHTML = html;
                document.querySelectorAll('.navbar .nav-link').forEach(link => link.classList.remove('active'));
                document.querySelectorAll('.navbar .nav-link').forEach(link => {
                    if (link.innerText.toLowerCase() === page.split('.')[0]) {
                        link.classList.add('active');
                    }
                });
            })
            .catch(error => {
                document.getElementById("content-area").innerHTML =
                    "<div class='alert alert-danger'>Error loading content.</div>";
            });
    }
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
