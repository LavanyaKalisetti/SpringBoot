package com.nt.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig:0-param constructor");
	}
@Bean(name="lTime")
public LocalTime createLTime() {
	System.out.println("AppConfig.createLTime()");
		return LocalTime.now();
}	
@Bean(name="lDate")
public LocalDate createLDate() {
	System.out.println("AppConfig.createLDate()");
	return LocalDate.now();
}
}
