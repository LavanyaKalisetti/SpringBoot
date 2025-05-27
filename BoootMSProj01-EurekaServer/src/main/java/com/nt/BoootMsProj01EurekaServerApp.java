package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoootMsProj01EurekaServerApp {

	public static void main(String[] args) {
		SpringApplication.run(BoootMsProj01EurekaServerApp.class, args);
	}

}
