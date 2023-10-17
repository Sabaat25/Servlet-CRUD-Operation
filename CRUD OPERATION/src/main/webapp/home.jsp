<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CRUD</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa; 
        }
        .container {
            margin-top: 50px;
            text-align: center;
        }
        .btn {
            margin: 10px; 
            padding: 15px 30px; 
            font-size: 18px; 
            border-radius: 5px; 
        }
        .btn-primary {
            background-color: #007bff; 
            border: none;
        }
        .btn-danger {
            background-color: #dc3545; 
            border: none;
        }
        .btn-warning {
            background-color: #ffc107; 
            border: none;
        }
        .btn-info {
            background-color: #17a2b8; 
            border: none;
        }
        .btn-success {
            background-color: #28a745;
            border: none;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1><i>CLICK</i></h1>
        <form action="home" method="post">
            <button type="submit" class="btn btn-primary" name="save">Save User</button>
            <button type="submit" class="btn btn-danger" name="delete">Delete</button>
            <button type="submit" class="btn btn-warning" name="update">Update</button>
            <button type="submit" class="btn btn-info" name="getid">Get By Id</button>
            <button type="submit" class="btn btn-success" name="getall">Get All</button>
        </form>
    </div>
</body>
</html>
