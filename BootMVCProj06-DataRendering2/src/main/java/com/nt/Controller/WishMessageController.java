package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class WishMessageController {
	
	//@RequestMapping(value="/report1",method=RequestMethod.POST)
	@PostMapping("/report1")
	public String showReport() throws Exception{
		System.out.println("WishMessageController.showReport()");
		return "show_report";
	}
	
	
	 // @RequestMapping(value="/report2",method=RequestMethod.GET) //old style
	   @GetMapping("/report2")
	   public String showReport1() throws Exception{
		   System.out.println("WishMessageController.showReport1()");
		   return "show_report1";
		    }
	  
	  
	   @RequestMapping({"/report1","/report2","/report3"}) 
	   public String showReport3() throws Exception{ 
		    return "show_report3"; 
		     }
	   }
		
		
		
	

	
