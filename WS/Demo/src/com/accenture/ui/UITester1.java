package com.accenture.ui;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.dao.EmployeeDAO;
import com.accenture.entity.EmployeeEntityBean;

public class UITester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO employeeDAOIMPL=null;
		
		try {
			
			ApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("com/accenture/resource/jpa_spring1.xml");
			
			employeeDAOIMPL = (EmployeeDAO) applicationContext.getBean("employeeDAO");
			
			//add employee
			
			//addEmployee(employeeDAOIMPL);
			
			//System.out.println("values: "+employeeDAOIMPL.findBySalaryGreaterThanEqual(11.0));
			
			//System.out.println("values: "+employeeDAOIMPL.findBySalaryGreaterThanAndRole(11.0,"Sr. Analyst"));
			
			//System.out.println("values: "+employeeDAOIMPL.getAllEmployeesBySalary(11.0));
			
			System.out.println("values: "+employeeDAOIMPL.getAllEmployeesByName("New Employee1"));
			
			System.out.println("values1: "+employeeDAOIMPL.getAllEmployeesByName1("New Employee1"));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void addEmployee(EmployeeDAO daoimpl) {
		// TODO Auto-generated method stub
		EmployeeEntityBean bean = new EmployeeEntityBean();
		
		bean.setInsertTime((new Date()));
		bean.setName("New Employee1");
		bean.setRole("Sr. Analyst");
		bean.setSalary(12.0);
		
		try {
			int id = daoimpl.save(bean).getId();
			System.out.println("employee registered.");
			
		}catch(Exception e) {
			
		}
		
		
	}

}
