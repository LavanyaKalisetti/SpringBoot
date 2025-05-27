package com.nt.Controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ShowHomeController {
	
			
			@RequestMapping("/process")
			public String process(Model model) {
				System.out.println("ShowHomeController.process()::ShareMemory Object class name::"+model.getClass());
				
				//add model attributes to shared memory
				model.addAttribute("attr1","val1");
				model.addAttribute("sysDt",LocalDateTime.now());
				
				//return LVN
				return "show_data";
}
}
