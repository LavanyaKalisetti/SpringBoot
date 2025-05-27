package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DesielEngine implements IEngine{
	
	@Override
	public void startEngine() {
		System.out.println("DesielEngine:DesielEngine started");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("DesielEngine:DesielEngine stopped");
	}

}
