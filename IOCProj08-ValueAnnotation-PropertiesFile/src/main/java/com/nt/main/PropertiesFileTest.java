package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.personalInfo;

public class PropertiesFileTest {
	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get spring bean class object reference
		personalInfo info=ctx.getBean("pInfo",personalInfo.class);
		System.out.println(info);
		
		//get access to Environment object
		Environment env=ctx.getEnvironment();
		System.out.println("os_name:"+env.getProperty("os.name"));
	}

}
