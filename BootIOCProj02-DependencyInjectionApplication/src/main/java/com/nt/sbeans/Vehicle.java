package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	//HAS-A property
	@Autowired
	@Qualifier("pEngine")
	private IEngine engine;
	
	public Vehicle() {
		System.out.println("Vehicle::0-param constructor");
	}
	
	//b.method
	public void journey(String sourcePlace,String destinationPlace) {
		System.out.println("Vehicle.journey()");
		engine.start();
		System.out.println("journey started at ::"+sourcePlace);
		System.out.println("journey is going on........");
		engine.stop();
		System.out.println("journey started at ::"+destinationPlace);
		
	}
	

}
