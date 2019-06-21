package com.cg.service;
import java.util.Map;

import com.cg.bean.*;

public interface EmployeeService {
	public boolean getdetails(Employee e);
	public String calculateScheme(int eid);
	public Map<Integer, Employee> getAllDetails();
	/*{
		System.out.println("==========================");
		System.out.println("Employee id= "+e.getEid()+" Name= "+e.getEname());
		System.out.println("Salary is= "+e.getSalary()+" designation is= "+e.getDesignation());
		
	}*/

}