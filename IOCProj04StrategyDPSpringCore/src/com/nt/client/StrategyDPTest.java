package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fpkt=ctx.getBean("fpfk",Flipkart.class);
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser"}, new double[] {90000.0,50000.0});
		System.out.println(resultMsg);
		ctx.close();
	}

}
