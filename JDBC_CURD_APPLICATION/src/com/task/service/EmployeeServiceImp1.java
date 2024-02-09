package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.EmployeeDaoImp1;
import com.task.dao.IEmployeeDao;

public class EmployeeServiceImp1 implements IEmployeeService {

	public void insertEmployee(EmployeeBean e) throws ClassNotFoundException, SQLException {
		IEmployeeDao dao = new EmployeeDaoImp1();
		dao.insertEmployee(e);

	}

	public void updateEmployee(int uid, EmployeeBean e) throws ClassNotFoundException, SQLException {
		IEmployeeDao dao = new EmployeeDaoImp1();
		dao.updateEmployee(uid, e);

	}

	public void selectEmployees() throws ClassNotFoundException, SQLException {
		IEmployeeDao dao = new EmployeeDaoImp1();
		dao.selectEmployees();
		
	}

	@Override
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException {
		IEmployeeDao dao = new EmployeeDaoImp1();
		dao.deleteEmployee(did);
	}

	
}
