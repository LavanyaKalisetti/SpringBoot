package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	
	public static void main(String[] args) {
		System.out.println("DependencyInjectionText.main()(start)");
		//create the IOC container
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get target spring Bean class object ref from the IOCContainer
		Object obj=ctx.getBean("wmg");
		//type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		//invoke the b.method
		String result=generator.generateWishMessage("Lavanya");
		System.out.println(result);
		//close the IOC container
		ctx.close();
		System.out.println("DependencyinjectionTest.main()(end)");
	
		}
}
