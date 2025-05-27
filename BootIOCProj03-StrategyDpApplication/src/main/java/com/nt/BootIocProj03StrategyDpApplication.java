package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Cricketer;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj03StrategyDpApplication {

	public static void main(String[] args) {
		
		//get Access to IOC Container
		ApplicationContext ctx=SpringApplication.run(BootIocProj03StrategyDpApplication.class, args);
		
		//get target spring bean class object ref
		Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		
		//invoke the b.method
		String msg=cktr.batting();
		System.out.println(msg);
		
		//close the container
		((ConfigurableApplicationContext)ctx).close();
	}

}
