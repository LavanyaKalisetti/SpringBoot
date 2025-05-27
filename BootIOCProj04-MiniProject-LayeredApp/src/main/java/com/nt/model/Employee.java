package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private Integer eno;
	private String ename;
	private String job;
	private Double salary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
	public void setEid(int int1) {}
	public void setEname(String string) {}
	public void setDesg(String string) {}
	public void setDeptno(int int1) {}
	public void getSalary(float float1) {}
	public String getEmpno() {
		return null;
	}
	public double getSalary() {
		return 0;
	}
	public void setGrossSalary(double d) {
	}
	public double getGrossSalary() {
		return 0;
	}
	public void setNetSalary(double d) {
	}
	public void setSalary(float float1) {}
}
