package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Customer;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootIocProj09YmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj09YmlApplication.class, args);
		Customer customer=ctx.getBean("cust",Customer.class);
		System.out.println(customer);
		((ConfigurableApplicationContext)ctx).close();
	}

}

