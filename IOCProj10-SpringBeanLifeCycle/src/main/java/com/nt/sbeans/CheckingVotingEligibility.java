package com.nt.sbeans;

import java.util.Date;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("com/nt/commons/Info.properties")
public class CheckingVotingEligibility {
	@Value("${voter.id}")
	private Integer id;
	
	@Value("${voter.name}")
	private String name;
	
	@Value("${voter.age}")
	private Integer age;
	
	private Date verifiedOn;
	
	public CheckingVotingEligibility() {
		System.out.println("CheckingVotingEligibility:0-param Constructor");
	}
	
	@PostConstruct   //init life cycle method
	public void myInit() {
		System.out.println("CheckingVotingEligibility.myInit()");
		
		//initialize the left over properties that had not participated in the injections
		verifiedOn=new Date();
		
		//validation logics
		if(name==null || age<=0) {
			throw new IllegalArgumentException("set correct values to name, age properties");
		}
	
	}
	
	//b.method
	public String checkEligibility() {
		System.out.println("CheckingVotingEligibility.checkEligibility()");
		if(age<18)
			return "Mr./Miss/Mrs."+name+" you are not Eligible for Voting -----> verified on:"+verifiedOn;
		else
			return "Mr./Miss/Mrs."+name+" you are Eligible for Voting -----> verified on:"+verifiedOn;
	}
	
	
	@PreDestroy  //destroy life cycle method
	public void myDestroy() {
		System.out.println("CheckingVotingEligibility.myDestroy()");
		
		//nullification of the bean properties
		name=null;
		age=null;
		verifiedOn=null;
		id=null;
	}

}
	


