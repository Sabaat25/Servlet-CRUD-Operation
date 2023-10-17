<%@page import="com.jsp.EmployeeDTO.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.EmployeeService.EmployeeService"%> 

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1>Employee List</h1>
        <% 
            EmployeeService employeeService = new EmployeeService(); 
            List<Employee> employees = employeeService.getAllEmployee();
        %>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Gender</th>
                    <th>Salary</th>
                    <th>Designation</th>
                </tr>
            </thead>
            <tbody>
                <% for (Employee e : employees) { %>
                    <tr>
                        <td><%= e.getId() %></td>
                        <td><%= e.getName() %></td>
                        <td><%= e.getEmail() %></td>
                        <td><%= e.getGender() %></td>
                        <td><%= e.getSalary() %></td>
                        <td><%= e.getDesignation() %></td>   
                        <td><a href="delete.jsp?id=<%= e.getId() %>" class="btn btn-danger btn-sm">Delete</a></td>
						<td><a href="update.jsp?id=<%= e.getId() %>" class="btn btn-primary btn-sm">Update</a></td>                     
                    </tr>
                <% } %>
            </tbody>
        </table> 
    </div>

</body>
</html>