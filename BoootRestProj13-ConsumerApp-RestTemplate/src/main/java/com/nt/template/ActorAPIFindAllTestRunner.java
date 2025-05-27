package com.nt.template;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorAPIFindAllTestRunner implements CommandLineRunner {
@Autowired
private RestTemplate template;


	@Override
	public void run(String... args) throws Exception {
		String url="http://localhost:8080/BoootRestProj10-MiniProject-Actor-api/actor-api/all";
        //invoke/consue the api endpoint
		ResponseEntity<String> response=template.getForEntity(url, null,String.class);
		System.out.println("response Content::"+response.getBody());
		System.out.println("response status code:"+response.getStatusCode());
		System.out.println("-----------");
		}
	

}
