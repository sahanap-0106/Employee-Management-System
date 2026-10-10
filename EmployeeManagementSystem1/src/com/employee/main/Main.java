package com.employee.main;

import java.util.Scanner;

import com.employee.dao.EmployeeDAO;
import com.employee.dao.impl.EmployeeDAOImpl;
import com.employee.model.Employee;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Employee employee=new Employee();
		
		System.out.println("Enter Employee ID:");
		employee.setEmpId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Employee Name:");
		employee.setEmpName(sc.nextLine());
		
		System.out.println("Enter Department:");
		employee.setDepartment(sc.nextLine());
		
		System.out.println("Enter Salary:");
		employee.setSalary(sc.nextDouble());
		
		EmployeeDAO dao=new EmployeeDAOImpl();
		
		dao.addEmployee(employee);
		
		
		
		
		
	}

}
