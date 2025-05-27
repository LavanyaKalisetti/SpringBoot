package com.nt.Controller;

import org.springframework.data.domain.Pageable;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.Entity.Actor;
import com.nt.service.IActorMgmtService;

@Controller
public class ActorOperationsController {
	@Autowired
	private  IActorMgmtService actorService;
	
	@GetMapping("/")
	public String showHomePage() {
		System.out.println("ActorOperationsController.showHomePage()");
		return "welcome";
	}
	
	@GetMapping("/report") 
	public String showReport(@PageableDefault(page=0,size=3,sort="category",direction=Sort.Direction.ASC)Pageable pageable,Map<String,Object>map) {
		System.out.println("ActorOperationsController.showReport()");
		Page<Actor>page=actorService.showAllActors(pageable);
		map.put("pageData",page);
		return "show_report";
	}
	
	
	
}


