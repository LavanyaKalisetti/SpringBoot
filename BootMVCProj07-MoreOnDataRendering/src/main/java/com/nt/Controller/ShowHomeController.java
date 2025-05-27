package com.nt.Controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	@GetMapping("/report")
	  public String showData(Map<String,Object>map) {
//	      map.put("name","Lavanya");
//	      map.put("age","22");
		
		map.put("nickNames",new String[] {"Lucky","Chinna","Vicky"});
		map.put("Friends",List.of("Nivi","Naini","Sneha"));
		map.put("PhoneNumbers",Set.of(654840,2297363,444453));
		map.put("idDetails",Map.of("AdharNo",34562789,"VoterId",9876678));
	     
	      //return LVN
	      return "result";
	}
	
	
}

