package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootIocProj10ComplexYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj10ComplexYmlApplication.class, args);
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		((ConfigurableApplicationContext)ctx).close();
	}

}
