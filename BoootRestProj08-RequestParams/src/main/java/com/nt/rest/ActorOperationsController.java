package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("actor-api")
public class ActorOperationsController {
	
//	@GetMapping("/report")
//	public ResponseEntity<String> showActorData(@RequestParam("aid") int id,
//			                                     @RequestParam("aname") String name){
//		System.out.println("Request param values are:"+id+","+name);
//		return new ResponseEntity<String>("Request params are:"+id+","+name,HttpStatus.OK);
//	}
	
	
//	
//	@GetMapping("/report")
//	public ResponseEntity<String> showActorData(@RequestParam int id,
//			                                     @RequestParam(required=false) String name){
//		System.out.println("Request param values are:"+id+","+name);
//		return new ResponseEntity<String>("Request params are:"+id+","+name,HttpStatus.OK);
//	}
//}


@GetMapping("/report")
public ResponseEntity<String> showActorData(@RequestParam int id,
		                                     @RequestParam(required=false,defaultValue="Lavanya") String name){
	System.out.println("Request param values are:"+id+","+name);
	return new ResponseEntity<String>("Request params are:"+id+","+name,HttpStatus.OK);
}
}