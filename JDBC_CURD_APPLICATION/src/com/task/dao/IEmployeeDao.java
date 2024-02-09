package com.task.dao;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeDao {
public void insertEmployee(EmployeeBean e) throws ClassNotFoundException, SQLException;
public void updateEmployee(int uid,EmployeeBean e) throws ClassNotFoundException, SQLException;
public void selectEmployees() throws ClassNotFoundException, SQLException;
public void deleteEmployee(int did)throws ClassNotFoundException, SQLException;

}
