package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BoootRestProj13ConsumerAppRestTemplateApp {
	
	@Bean(name="template")
	public RestTemplate createTemplate() {
		System.out.println("BoootRestProj13ConsumerAppRestTemplateApp.createTemplate()");
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(BoootRestProj13ConsumerAppRestTemplateApp.class, args);
	}

}
