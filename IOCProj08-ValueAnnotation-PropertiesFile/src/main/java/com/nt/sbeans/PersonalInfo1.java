package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("pInfo1")
public class PersonalInfo1 {
	@Autowired
	private Environment env;
	
	public void showData() {
		System.out.println("os.name:"+env.getProperty("os.name"));
		System.out.println("per.id key value:"+env.getProperty("per.id"));
		
	}
	

}
