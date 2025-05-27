package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootIocProj07BulkInjectionUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj07BulkInjectionUsingConfigurationPropertiesApplication.class, args);
		Company company=ctx.getBean("Comp",Company.class);
		System.out.println(company);
		((ConfigurableApplicationContext)ctx).close();
	}
	

}
