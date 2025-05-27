package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpMethod;


@Component
public class BillingMSClientComp {
	@Autowired
	private DiscoveryClient client;
	
	public ResponseEntity<String> invokeDoBilling(){
		//get target MS service instance from the Eureka Server
		List<ServiceInstance> listSI=client.getInstances("BillingMS");
		//get endpoint details of target MS
		URI uri=listSI.get(0).getUri(); //gives http://localhost:7071
		//complete the URL
		String urlInfo=uri+"/billing-api/bill";
		//create RestTemplate class object
		RestTemplate template=new RestTemplate();
		//invoke the Target MS endpoint
		ResponseEntity<String> resp=template.exchange(urlInfo,HttpMethod.GET, null,String.class);
		return resp;
		}

}
