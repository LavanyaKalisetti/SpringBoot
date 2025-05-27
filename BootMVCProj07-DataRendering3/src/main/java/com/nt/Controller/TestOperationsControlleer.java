package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestOperationsControlleer {
	
	@GetMapping("/report")
	public String showTestReport() {
		return  "show_test_report";
		
	}

}
