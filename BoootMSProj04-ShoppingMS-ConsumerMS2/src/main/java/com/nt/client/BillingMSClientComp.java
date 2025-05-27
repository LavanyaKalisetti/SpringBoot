package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpMethod;


@Component
public class BillingMSClientComp {
	@Autowired
	private LoadBalancerClient client;
	
	public ResponseEntity<String> invokeDoBilling(){
		System.out.println("client comp class name::"+client.getClass());
		//get target MS less load instance from the Eureka Server
		ServiceInstance si=client.choose("BillingMS");
		//get endpoint details of target MS
		URI uri=si.getUri(); //gives http://localhost:7071
		//complete the URL
		String urlInfo=uri+"/billing-api/bill";
		//create RestTemplate class object
		RestTemplate template=new RestTemplate();
		//invoke the Target MS endpoint
		ResponseEntity<String> resp=template.exchange(urlInfo,HttpMethod.GET, null,String.class);
		return resp;
		}

}
