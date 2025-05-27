package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String args[]) {
		//crate IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//get target spring bean classobj ref
		WishMessageGenerator generator=(WishMessageGenerator)ctx.getBean("wmg");
		//invoke the b.method
		String msg=generator.generateWishMessage("Lavanya");
		System.out.println(msg);
		//close the IOC container
		ctx.close();
		
	}

}
