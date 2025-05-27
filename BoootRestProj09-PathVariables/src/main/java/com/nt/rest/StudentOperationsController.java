package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-api")
public class StudentOperationsController {
	
//	@GetMapping("/report/{sno}/{sname}/{sadd}")
//	public ResponseEntity<String> showStudentData(@PathVariable("sno") int no,
//			                                      @PathVariable("sname") String name,
//			                                      @PathVariable   String sadd){
//		System.out.println("Path variable values::"+no+","+name+","+sadd);
//		
//		return new ResponseEntity<String>("path varibale values::"+no+","+name+","+sadd,HttpStatus.OK);
//		}

	
//	@GetMapping({"/report/{sno}/{sname}/{sadd}","/report/{sno}/{sname}","/report/{sno}","/report"})
//	public ResponseEntity<String> showStudentData(@PathVariable(name="sno",required=false) int no,
//			                                      @PathVariable(name="sname",required=false) String name,
//			                                      @PathVariable (required=false)  String sadd){
//		System.out.println("Path variable values::"+no+","+name+","+sadd);
//		
//		return new ResponseEntity<String>("path varibale values::"+no+","+name+","+sadd,HttpStatus.OK);
//		}

	
//	@GetMapping("/report/{no}/{name}")
//	public String fetchData(@PathVariable(name="sname",required=false)String name,
//			                @PathVariable(required=false) Integer no) {
//		return no+","+name;
//	}

	
	@GetMapping("/report/{no}/{name}")
	public ResponseEntity<String> fetchData1(@PathVariable(name="no",required=false) int no,
	                        @PathVariable(name="name",required=false) String name) {
		System.out.println("StudentOperationsController.fetchData1()");
	    return new ResponseEntity<String>("FetchData1",HttpStatus.OK);
	}

	@GetMapping("/report/no/{name}")
	public ResponseEntity<String> fetchData2(@RequestParam(required = false) int no,
	                                  @RequestParam(required = false) String name) {
		System.out.println("StudentOperationsController.fetchData2()");
	    return new ResponseEntity<String>("FetchData2",HttpStatus.OK);
	}

	@GetMapping("/report/{no}/name")
	public ResponseEntity<String> fetchData3(@PathVariable(name="no",required=false) int no,
			                                 @PathVariable(name="name",required=false) String name) {
		System.out.println("StudentOperationsController.fetchData3()");
	    return new ResponseEntity<String>("FetchData3",HttpStatus.OK);
	}

	@GetMapping("/report/{no}/{name}")
	public ResponseEntity<String> fetchData4(@PathVariable(name="no",required=false) int no,
			                                 @PathVariable(name="name",required=false) String name) {
		System.out.println("StudentOperationsController.fetchData4()");
	    return new ResponseEntity<String>("FetchData4",HttpStatus.OK);
	}

	

	
	
	
	
	
	
	
	
	
	
//    @GetMapping("/report/{no}/{name}")
//    public String fetchData(@PathVariable("name") String name,
//                            @PathVariable("no") Integer no) {
//        return "Name: " + name + ", No: " + no;
//    }
//
//    
//    @GetMapping({"/report", "/report/{no}", "/report/{no}/{name}", "/report/{no}/{name}/{sadd}"})
//    public ResponseEntity<String> showStudentData(
//            @PathVariable(name = "no", required = false) Integer no,
//            @PathVariable(name = "name", required = false) String name,
//            @PathVariable(name = "sadd", required = false) String sadd) {
//
//        return new ResponseEntity<>(
//                "Student Data - No: " + no + ", Name: " + name + ", Address: " + sadd,
//                HttpStatus.OK
//        );
    }
	
	
	
	
	
	
	
