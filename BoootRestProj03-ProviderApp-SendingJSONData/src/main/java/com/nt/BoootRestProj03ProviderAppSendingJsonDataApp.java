package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BoootRestProj03ProviderAppSendingJsonDataApp {

	public static void main(String[] args) {
		SpringApplication.run(BoootRestProj03ProviderAppSendingJsonDataApp.class, args);
	}

}

