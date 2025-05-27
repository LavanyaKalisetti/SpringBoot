package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CheckingVotingEligibility;

public class SpringBeanLifeCycleTest {
	public static void main(String[] args) {
		
		//create the IOC Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring bean class object reference
		CheckingVotingEligibility voter=ctx.getBean("voter",CheckingVotingEligibility.class);
		
		//invoke the b.methods
		try {
			String result=voter.checkEligibility();
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close the container
		ctx.close();
		
	}

}
