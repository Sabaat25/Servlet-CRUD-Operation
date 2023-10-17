package com.jsp.Employeecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.EmployeeService.EmployeeService;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {   
	EmployeeService employeeService=new EmployeeService();	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		
		String id=req.getParameter("id"); 
		int i=Integer.parseInt(id); 
		
		boolean res=employeeService.deleteEmployeeById(i); 
		if(res==true) {  
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp"); 
			requestDispatcher.forward(req, resp);
		}
			
		else { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("delete.jsp"); 
			requestDispatcher.include(req, resp);

		}
	}
}
