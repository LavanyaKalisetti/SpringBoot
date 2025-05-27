package com.nt.ms;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishMessageMSService {
	@Value("${spring.application.instance-id}")
	public String instanceid;
	
	@GetMapping("/message")
	public ResponseEntity<String> showWishMessage(){
		//generate with message
		LocalTime time=LocalTime.now();
		//get current hour of the day
		int hour =time.getHour();
		String msg=null;
		if(hour<12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good Afternoon";
		else if(hour<20)
			msg="Good Evening";
		else
			msg="Good Night";
		//return ResponseEntity object
		return new ResponseEntity<String>(msg+" instance id::"+instanceid,HttpStatus.OK);
		}

}
