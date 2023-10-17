<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete User</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Delete User</h1>
        <form action="delete" method="post">
            <div class="form-group">
                <label for="id">Enter the ID:</label>
                <input type="number" class="form-control" id="id" name="id" value="<%=request.getParameter("id") %>">
            </div>
            <button type="submit" class="btn btn-danger" name="delete">Delete</button>
        </form>
    </div>
</body>
</html>
</html>