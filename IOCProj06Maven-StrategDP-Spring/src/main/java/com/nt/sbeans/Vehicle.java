//package com.nt.sbeans;
//
//import java.util.Arrays;
//import java.util.Random;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component("")
//public final class Vehicle{
//	@Autowired
//	@Qualifier("")
//	private IEngine iengine;
//	
//	//b.method
//	public String journey(String string, String string2) {
//		
//		return String,String;
//
//	}
//	
//
//}
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")  // Naming the component as "vehicle"
public final class Vehicle {

    @Autowired
    @Qualifier("engine")  // Assuming a bean named "engine" exists
    private IEngine iengine;

    // Business method
    public String journey(String start, String destination) {
        return "Journey started from " + start + " to " + destination;
    }
}
