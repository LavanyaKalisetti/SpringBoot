package com.nt.Controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ShowHomeController {
	
			
			@RequestMapping("/process")
			public Model process() {
				Model model = new BindingAwareModelMap();
				
				//add model attribute to shared  memory
				model.addAttribute("attr1","val1");
				model.addAttribute("sysDt",LocalDateTime.now());
				return model;
}
}
