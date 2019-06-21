package com.cg.service;
import com.cg.bean.*;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class EmployeeServiceImpl implements  EmployeeService{
static Map<Integer, Employee> accmap=new  HashMap<Integer, Employee>();


	@Override
	public boolean getdetails(Employee e) {
		accmap.put(e.getEid(), e);
		return true;
		// TODO Auto-generated method stub
	}

	@Override
	public String calculateScheme(int eid) {
		Employee e=accmap.get(eid);
		// TODO Auto-generated method stub
		//System.out.println(e.getSalary()+" , "+e.getDesignation());
		String scheme="";
		if(e.getSalary()>5000 && e.getSalary()<20000 && e.getDesignation().equals("System Associate"))
		{
			scheme="Scheme C";
		}
		else if(e.getSalary()>=20000 && e.getSalary()<40000 && e.getDesignation().equals("Programmer"))
		{
			scheme="Scheme B";
		}
		else if(e.getSalary()>=40000 && e.getDesignation().equals("Manager"))
		{
			scheme="Scheme A";
		}
		else if(e.getSalary()<5000 && e.getDesignation().equals("Clerk"))
		{
			scheme="No Scheme";
		}
		else
		{
			scheme="Invalid";	
		}
		    
		return scheme;
	}

	@Override
	public Map<Integer, Employee> getAllDetails() {
		// TODO Auto-generated method stub
		return accmap;
	}

/*	@Override
	public Map<Integer, Employee> getAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}*/
	

}