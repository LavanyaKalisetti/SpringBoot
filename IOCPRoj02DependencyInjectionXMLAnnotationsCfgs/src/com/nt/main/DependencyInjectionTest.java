package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
		
		//get target spring bean class object ref from the IOCcontainer
		Object obj=ctx.getBean("wmg");
		
		//type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		System.out.println("Gathering target spring bean class obj ref");
		
		//invoke the b.method
		String result=generator.generateWishMessage("Lavanya");
		System.out.println(result);
		
		//close the IOC container
		ctx.close();
		System.out.println("DependencyINjectionTest.main()(end)");
		
	
	}

}
