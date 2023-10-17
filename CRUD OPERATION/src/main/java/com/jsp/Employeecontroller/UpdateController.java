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

@WebServlet("/update")
public class UpdateController extends HttpServlet{ 
	
	EmployeeService employeeService=new EmployeeService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email"); 
		String id=req.getParameter("id");
	    int i= Integer.parseInt(id);
		
		Employee e1= employeeService.updateEmailById(i, email);
		if(e1!=null) {  
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp"); 
			requestDispatcher.forward(req, resp);
		}
			
		else { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("update.jsp"); 
			requestDispatcher.include(req, resp);

		}
		}
	}
