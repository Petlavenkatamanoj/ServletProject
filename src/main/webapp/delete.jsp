<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<style>
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
    width: 400px;
    display: flex;
    flex-direction: column;
    gap: 10px;
    padding: 20px;
    background-color: white;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
  }

  input[type="submit"] {
    padding: 10px;
    background-color: #007BFF;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }

  input[type="number"] {
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
  }

  input[type="submit"]:hover {
    background-color: #0056b3;
  }
</style>

<div class="form-wrapper">
  <form action="del" method="get">
    <label>Enter an ID:</label>
    <input type="number" name="id" required>

    <input type="submit" value="Delete">
  </form>
</div>
