package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BoootMsProj06ConfigServerApp {

	public static void main(String[] args) {
		SpringApplication.run(BoootMsProj06ConfigServerApp.class, args);
	}

}
