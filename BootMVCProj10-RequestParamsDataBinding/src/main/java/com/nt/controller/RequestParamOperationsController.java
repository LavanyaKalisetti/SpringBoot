package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamOperationsController {
	
//	@GetMapping("/process")
//	public String process(@RequestParam("sno")int no,@RequestParam("sname")String name) {
//		System.out.println("sno="+no+"......"+"sname="+name);
//		return "show_data";
//	}
	
	
	/*
	 * @GetMapping("/process") public String process(@RequestParam("sno")int
	 * sno,@RequestParam("sname")String sname) {
	 * System.out.println("sno="+sno+"......"+"sname="+sname); return "show_data"; }
	 */
	
	/*
	 * @GetMapping("/process") public String
	 * process(@RequestParam(name="sno",defaultValue="2002")int
	 * no,@RequestParam("sname")String name) { System.out.println(no+"......"+name);
	 * return "show_data"; }
	 */
	
	
//	@GetMapping("/process") 
//	public String process(@RequestParam(name="sno",required=false)Integer no,@RequestParam("sname")String name) {
//		 System.out.println(no+"......"+name);
//          return "show_data";
//			 }
	
//	@GetMapping("/process") 
//	public String process(@RequestParam(name="sno",defaultValue="2002") Integer no,
//			              @RequestParam("sname")String name,
//	                      @RequestParam("sadd")String addrs[],
//	                      @RequestParam("sadd")List<String> saddList,
//	                      @RequestParam("sname")Set<String> saddSet){               
//		 System.out.println(no+" "+name+" "+Arrays.toString(addrs)+" "+saddList+" "+saddSet);
//          return "show_data";
//			 }
	
	@GetMapping("/process") 
	public String process(@RequestParam(name="sno",required=false) Integer no,
			              @RequestParam("sname")String name,
	                      @RequestParam("sadd")String addrs[]) {
		     System.out.println(no+" "+name+" "+addrs);
		     return "show_data";
	}
}
