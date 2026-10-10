package com.employee.dao;

import com.employee.model.Employee;

public interface EmployeeDAO {
	void addEmployee(Employee employee);
	
	void viewEmployee();
	
	void searchEmployee();
	
	void updateEmployee();
	
	void deleteEmployee();
	
}
