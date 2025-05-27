package com.nt.Controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
			
			@RequestMapping("/process")
			public String process(Map<String,Object>map) {
				System.out.println("ShowHomeController.process()::ShareMemory Object class name::"+map.getClass());
				
				//add model attributes to shared memory
				map.put("attr1","val1");
				map.put("sysDt",LocalDateTime.now());
				
				//return LVN
				return "show_data";
}
}
