package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WishMessageController {
	
	@RequestMapping("/report")
	public String showReport() throws Exception{
		return "show_report";
	}
	
	@RequestMapping("/report")
	public String showReport1() throws Exception{
		return "show_report1";
	}
	
	@RequestMapping({"/report1","/report2","/report3"})
	public String showReport2() throws Exception{
		return "show_report3";
	}
		
		
		
	}


