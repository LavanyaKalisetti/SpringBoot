package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("employeeService")
public class EmployeeServiceImplementation implements IEmployeeManagementService{
	@Autowired
	private IEmployeeDAO employeeDAO;
	
	@Override
	public List<Employee>fetchEmployeeByDesgs(String desg1,String desg2,String desg3)throws Exception{
		
		//convert the desgs into UPPERCASE LETTERS
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		
		//use DAO
		List<Employee>list=employeeDAO.getEmpsByDesgs(desg1,desg2,desg3);
		
		//sort the object in list Collection
		list.sort((t1,t2)->t1.getEmpno().compareTo(t2.getEmpno()));
		
		//calculate gross salary and net salary
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5));
			emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));
		});
		return list;
		
	}

	@Override
	public List<Employee> fetchAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		return null;
	}
	

}
