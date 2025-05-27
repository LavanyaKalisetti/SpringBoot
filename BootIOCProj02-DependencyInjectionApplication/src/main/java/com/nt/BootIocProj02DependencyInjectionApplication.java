package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootIocProj02DependencyInjectionApplication {

	public static void main(String[] args) {
		
		//get IOC Container
		ApplicationContext ctx=SpringApplication.run(BootIocProj02DependencyInjectionApplication.class,args);
		
		//get Access to target spring bean class object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		
		//invoke the b.method
		vehicle.journey("Hyderabad","Delhi");
		
		//close the container
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
