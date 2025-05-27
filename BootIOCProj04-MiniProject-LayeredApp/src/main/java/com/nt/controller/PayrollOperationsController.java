package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeManagementService;

@Controller("payroll")
public class PayrollOperationsController {
	
	@Autowired
	private IEmployeeManagementService service;
	
	public List<Employee>showAllEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception{
		List<Employee> list = null;
		return list;
		
	}
	

}
