package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.Flipkart;
import com.nit.cfgs.AppConfig;

public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser"},new double[] {60000.0,70000.0});
		System.out.println(resultMsg);
		ctx.close();
	}

}
