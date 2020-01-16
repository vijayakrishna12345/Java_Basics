package com.rakuten.prj.dao;

import com.rakuten.prj.entity.Employee;

public interface EmployeeDao {
	
	void addEmployee(Employee p);
	Employee findById(int id);

}
