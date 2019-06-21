package com.cg.pl;
import java.io.*;

import com.cg.bean.*;
import com.cg.service.*;
import java.util.*;
public class Driver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service=new EmployeeServiceImpl();
	    Map<Long,Employee> acc=new TreeMap<Long,Employee>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true)
		{
		System.out.println("Menu");
		System.out.println("======================");
		System.out.println("Press 1 for creating employee");
		System.out.println("Press 2 for calculating scheme");
		System.out.println("Press 3 for display");
		System.out.println("Press 4 for exit");
		choice=br.readLine();
		switch(choice)
		{
			case "1":
			int eid=0;
			String ename="";
			double salary=0.0;
			String designation="";
			System.out.println("Enter employee id");
		    while(true)
			{
			    	 String s_id=br.readLine();
			    	 boolean c=Validator.validate(s_id, Validator.idpattern);
			    	 if(c==true)
			    	 {
			    		 try {
			    		 eid=Integer.parseInt(s_id);
			    		 break;
			    	          }
			    		 catch(NumberFormatException e)
			    		 {
			    			 System.out.println("Enter employee again in numeric");
			    		 }
			         }
			    	 else
			    	 {
			    		 System.out.println("Enter id in 3 digits");
			    	 }
		         }//end of employee id while
		         
			     System.out.println("Enter employee name");
			     while(true)
			     {
			    	 String s_na=br.readLine();
			    	 boolean c=Validator.validate(s_na, Validator.namepattern);
			    	 if(c==true)
			    	 {
			    		 try {
			    		 ename=s_na;
			    		 break;
			    	          }
			    		 catch(NumberFormatException e)
			    		 {
			    			 System.out.println("Enter employee number in alphabetical order");
			    		 }
			         }
			    	 else
			    	 {
			    		 System.out.println("Enter name in correct format");
			    	 }
		         }//end of employee name while
		         
			     System.out.println("Enter Employee designation");
			     while(true)
			     {
			    	 String s_d=br.readLine();
			    	 boolean c=Validator.validate(s_d, Validator.despattern);
			    	 if(c==true)
			    	 {
			    		 try {
			    		 designation=s_d;
			    		 break;
			    	          }
			    		 catch(NumberFormatException e)
			    		 {
			    			 System.out.println("Enter employee designation in alphabets");
			    		 }
			         }
			    	 else
			    	 {
			    		 System.out.println("Enter designation again");
			    	 }
		         }//end of employee id while
			     System.out.println("Enter employee salary");
			     while(true)
			     {
			    	 String s_sa=br.readLine();
			    	 boolean c=Validator.validate(s_sa, Validator.salpattern);
			    	 if(c==true)
			    	 {
			    		 try {
			    		 salary=Double.parseDouble(s_sa);
			    		 break;
			    	          }
			    		 catch(NumberFormatException e)
			    		 {
			    			 System.out.println("Enter employee salary in numeric");
			    		 }
			         }
			    	 else
			    	 {
			    		 System.out.println("Enter salary again ");
			    	 }
		         }//end of employee id while
			     Employee ob=new Employee(eid,ename,salary,designation);
			     boolean b=service.getdetails(ob);
				System.out.println("Details Successfully added "+b+"\n"+ob);
				break;
		      
				
				
		case "2":System.out.println("enter employee id ");
					String s_id=br.readLine();
					eid=Integer.parseInt(s_id);
		         System.out.println("Employee Scheme = "+service.calculateScheme(eid));
		         break;
		      
		case "3":
				System.out.println("The details for employees are");
				Map<Integer, Employee> accmap=service.getAllDetails();
				Collection<Employee> vc=accmap.values();
				List<Employee> acclist=new ArrayList<Employee> (vc);

				
				for(Employee o:acclist) {
					System.out.println(o);
					
				}
				break;
		         
		case "4":System.out.println("System exiting");
		         System.exit(0);
		         break;
		         
		default:System.out.println("wrong choice");
		}
		}
	}
}
