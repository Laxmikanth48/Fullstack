package com.task.ui;
import com.task.bean.EmployeeBean;
import com.task.service.*;

import java.sql.SQLException;
import java.util.Scanner;


public class Demo_CRUD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("select your option");
		System.out.println("1. insert employee data");//create
		System.out.println("2. update employee data");//update
		System.out.println("3  select employee data");//read
		System.out.println("4  delete employee data");//delete
		int option=sc.nextInt();
		switch(option) {
		case 1:
		{
			insertEmployee();
			break;
		}
		case 2:
		{
			updateEmployee();
			break;
		
		}
		case 3:
		{
			selectEmployees();
			break;
		}
		case 4:
		{
			deleteEmployee();
			break;
		}
		default:
		{
		System.out.println("your entered option is not match");	
		break;
		}
		}
		
	}

	private static void updateEmployee() throws ClassNotFoundException, SQLException {
		System.out.println("PLEASE ENTER THE ID YOU WANT TO UPDATE");
		Scanner sc=new Scanner(System.in);
		int id =sc.nextInt();
		System.out.println("ENTER NEW NAME");
		String uname=sc.next();
		System.out.println("ENTER NEW ADDRESS");
		String uadd=sc.next();
		EmployeeBean e=new EmployeeBean(id,uname,uadd);
		IEmployeeService service=new EmployeeServiceImp1();
		service.updateEmployee(id, e);
				
	}

	private static void selectEmployees() throws ClassNotFoundException, SQLException {
		IEmployeeService service=new EmployeeServiceImp1();
		service.selectEmployees();
	}
	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		IEmployeeService service=new EmployeeServiceImp1();
		Scanner sd=new Scanner(System.in);
		System.out.println("enter id to delete");
		int did =sd.nextInt();
		service.deleteEmployee(did);

}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {	
		IEmployeeService service=new EmployeeServiceImp1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("ENTER YOUR NAME");
		String name=sc.next();
		System.out.println("ENTER YOUR ADDRESS");
		String address=sc.next();
		EmployeeBean e=new EmployeeBean(id,name,address);
			
		service.insertEmployee(e);
		
	}

}