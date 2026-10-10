package com.employee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;
import com.employee.util.DBConnection;

public class EmployeeDAOImpl implements EmployeeDAO{
	public void addEmployee(Employee employee) {
		try {
			Connection con=DBConnection.getConnection();
			
			String sql="INSERT INTO employee VALUES(?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getEmpName());
			ps.setString(3, employee.getDepartment());
			ps.setDouble(4, employee.getSalary());
			
			int rows=ps.executeUpdate();
			
			if(rows>0) {
				System.out.println("Employee Added Successfully!");
			}
			con.close();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
    public void viewEmployee() {
    	try {
			Connection con=DBConnection.getConnection();
			
			String sql="SELECT * FROM employee";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			System.out.println("\n----Employee List----");
			
			while(rs.next()) {
				System.out.println("ID:" + rs.getInt("emp_id"));
				System.out.println("Name:" + rs.getString("emp_name"));
				System.out.println("Department:" + rs.getString("department"));
				System.out.println("Salary:" +rs.getDouble("salary"));
				System.out.println("----------------");
			}
			
			con.close();	
	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    public void searchEmployee() {
	
    }
    public void updateEmployee() {
	
    }
    public void deleteEmployee() {
	
     }

}
