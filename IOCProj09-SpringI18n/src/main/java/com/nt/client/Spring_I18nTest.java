package com.nt.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class Spring_I18nTest { 
	public static void main(String[] args) {
		
		//create IOC Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//read language code and country code  from the end user
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Language Code::");
		String lang=scn.next();
		
		System.out.println("Enter Country Code::");
		String country=scn.next();
		
		//prepare Locale object having language code + country code
		Locale locale=new Locale(lang,country);
		Locale locale1=new Locale(lang,country);
		
		
		//read the message from the Locale specific properties file using the ctx.getmessage(-) method
		String msg1=ctx.getMessage("Morning.msg",new String[] {"Lavanya"},locale1);
		String msg2=ctx.getMessage("Welcome.msg",new String[] {},locale1);
		String msg3=ctx.getMessage("Application.msg",new String[] {},locale1);
		String msg4=ctx.getMessage("WishMessage.msg",new String[] {},locale1);
		
		//Display messages
		System.out.println(msg1+"----"+msg2+"----"+msg3+"----"+msg4+"----");
		
		//close the container
		ctx.close();
		
		
	}

}
