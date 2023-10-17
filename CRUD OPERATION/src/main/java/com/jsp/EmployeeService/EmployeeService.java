package com.jsp.EmployeeService;

import java.util.List;

import javax.persistence.Query;

import com.jsp.EmployeeDAO.EmployeeDao;
import com.jsp.EmployeeDTO.Employee;

public class EmployeeService { 
	
	EmployeeDao employeeDao=new EmployeeDao(); 
	
	public Employee saveEmployee(Employee employee) {  
		if(employee.getName()!=null && employee.getEmail()!=null && employee.getGender()!=null 
				&& employee.getSalary()>0 && employee.getDesignation()!=null) { 
			return employeeDao.saveEmployee(employee);
		}
		return null;
	} 
	
		public boolean deleteEmployeeById(int id) {
			return employeeDao.deleteEmployeeById(id);
		} 
		
		public Employee updateEmailById(int id, String email) {
			return employeeDao.updateEmailById(id, email);
					
		}  
		
		public List<Employee> getAllEmployee() {
			return employeeDao.getAllEmployee();
		}



}
