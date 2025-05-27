package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine::0-param Constructor)");	
		}
	@Override
	public void start() {
		System.out.println("DieselEngine.start()::Engine Started");
	}
	@Override
	public void stop() {
		System.out.println("DieselEngine.stop()::Engine Stopped");
	}

}
