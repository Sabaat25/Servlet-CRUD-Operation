package com.jsp.EmployeeDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.EmployeeDTO.Employee;

public class EmployeeDao { 
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vishu"); 
	EntityManager entityManager=entityManagerFactory.createEntityManager(); 
	EntityTransaction entityTransaction=entityManager.getTransaction(); 
	
	public Employee saveEmployee(Employee employee) { 
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee; 
		
	} 
	
	public boolean deleteEmployeeById(int id) {  
		Employee employee=entityManager.find(Employee.class,id); 
		if(employee!=null) {
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		return true; 
		} 
		return false;
	} 
	

	public Employee updateEmailById(int id, String email) {

		Employee employee = entityManager.find(Employee.class, id); 
		employee.setEmail(email);

		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		
		return employee;
	}
	
	public Employee getEmployeeById(int id) { 
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
		
	} 
	public List<Employee> getAllEmployee() {
		String sql = "SELECT e FROM Employee e";  		
		Query query = entityManager.createQuery(sql); 		
		return query.getResultList(); 
	}

}
