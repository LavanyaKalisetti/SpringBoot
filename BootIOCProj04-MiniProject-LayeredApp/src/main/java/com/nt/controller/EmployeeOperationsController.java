package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.nt.model.Employee;
import com.nt.service.IEmployeeManagementService;

@Controller
public class EmployeeOperationsController {

    @Autowired
    @Qualifier("employeeOperationsController")
    private EmployeeOperationsController employeeOperationsController;

    private IEmployeeManagementService employeeService;
	public List<Employee> showEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		
		return employeeService.fetchEmployeeByDesgs(desg1, desg2, desg3);
	}

}
