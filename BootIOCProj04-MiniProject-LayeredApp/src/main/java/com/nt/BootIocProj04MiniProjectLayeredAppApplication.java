package com.nt;

import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.nt.controller.EmployeeOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj04MiniProjectLayeredAppApplication {

	public static void main(String[] args) {
		
		try( //get access toIOC container
		ConfigurableApplicationContext ctx=SpringApplication.run(BootIocProj04MiniProjectLayeredAppApplication.class, args);
			//get Scanner class object
			Scanner sc=new Scanner(System.in);
	){
			//get controller spring bean class object reference
			EmployeeOperationsController controller=ctx.getBean("EmployeeOperationsController",EmployeeOperationsController.class);
			
			//read inputs from the enduser
			System.out.println("Enter Desg1:");
			String desg1=sc.next();
			
			System.out.println("Enter Desg2:");
			String desg2=sc.next();
			
			System.out.println("Enter Desg3:");
			String desg3=sc.next();
			
			//invoke the b.methods
			List<Employee>list=controller.showEmployeesByDesgs(desg1,desg2,desg3);
			
			//display result
			System.out.println("Employees belonging to " +desg1+""+desg2+""+desg3+"are");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}
			catch(Exception e) {
				System.out.println("Internal Problem:"+e.getMessage());
			}
		}
	}

