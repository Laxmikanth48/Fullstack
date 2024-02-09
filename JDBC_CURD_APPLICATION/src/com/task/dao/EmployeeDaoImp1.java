package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;

import com.task.util.EmployeeUtil;

public class EmployeeDaoImp1 implements IEmployeeDao {
	public static PreparedStatement pst = null;
	public static Connection connection = null;

	@Override
	public void insertEmployee(EmployeeBean e) throws ClassNotFoundException, SQLException {
		int empId = e.getEmpid();
		String empName = e.getEmpname();
		String empAddress = e.getEmpaddress();
		connection = EmployeeUtil.getDBConnection();
		pst = connection.prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1, empId);
		pst.setString(2, empName);
		pst.setString(3, empAddress);
		pst.executeUpdate();
		System.out.println("insert one record successfully");
		pst.close();
		connection.close();

	}

	public void updateEmployee(int uid, EmployeeBean e) throws ClassNotFoundException, SQLException {
		String uname = e.getEmpname();
		String uadd = e.getEmpaddress();
		connection = EmployeeUtil.getDBConnection();
		pst = connection.prepareStatement(
				"update employee set empName='" + uname + "', empAddress='" + uadd + "' where empid=" + uid);
		pst.executeUpdate();
		System.out.println("RECORD HAS BEEN UPDATED SUCCESFULLY!!!!!");
		pst.close();
		connection.close();

	}

	@Override
	public void selectEmployees() throws ClassNotFoundException, SQLException {
		connection = EmployeeUtil.getDBConnection();
		pst = connection.prepareStatement("select * from employee");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
					
		
		}
		System.out.println("RECORD CREDENTIALS");
		pst.close();
		connection.close();
	}

	@Override
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException {
		connection = EmployeeUtil.getDBConnection();
		pst = connection.prepareStatement("delete from employee where empid="+did);
		pst.executeUpdate();
		System.out.println("RECORD IS DELETED");
		pst.close();
		connection.close();
	}

}
