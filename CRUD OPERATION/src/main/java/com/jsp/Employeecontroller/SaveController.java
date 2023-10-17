package com.jsp.Employeecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.EmployeeDTO.Employee;
import com.jsp.EmployeeService.EmployeeService;

@WebServlet("/save")
public class SaveController extends HttpServlet {   
	EmployeeService employeeService=new EmployeeService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String designation=req.getParameter("designation");
		String salary=req.getParameter("salary");
		
		double sal=Double.parseDouble(salary);
		
		Employee employee=new Employee(); 
		employee.setName(name); 
		employee.setEmail(email); 
		employee.setGender(gender); 
		employee.setDesignation(designation); 
		employee.setSalary(sal); 
		
		Employee e1= employeeService.saveEmployee(employee); 
		if(e1!=null) {   
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("AdminLogin.jsp"); 
			requestDispatcher.forward(req, resp);
		}
			
		else { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("saveAdmin.jsp"); 
			requestDispatcher.include(req, resp);

		}
		}
		
		
	}

