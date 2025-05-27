package com.nt.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.Entity.Actor;
import com.nt.service.IActorMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ActorOperationsController {
	@Autowired
	private  IActorMgmtService actorService;
	
	@GetMapping("/")
	public String showHomePage() {
		System.out.println("ActorOperationsController.showHomePage()");
		return "welcome";
	}
	
	@GetMapping("/report") //G-GET
	public String showReport(Map<String,Object>map) {
		System.out.println("ActorOperationsController.showReport()");
		List<Actor>list=actorService.showAllActors();
		map.put("listActors",list);
		return "show_report";
	}
	
	@GetMapping("/register")//TO launch form page of Register
	public String showHomePageForRegisterActor(@ModelAttribute("actor")Actor actor) {
		//return LVN
		return "actor_register_form";
	}
	
	/*
	 * @PostMapping("/register") //Problem code 
	 * public String registerActor(@ModelAttribute("actor")Actor actor,Map<String,Object>map) {
	 * System.out.println("ActorOperationsController.registerActor()"); //use
	 * service String msg=actorService.registerActor(actor); List<Actor>
	 * list=actorService.showAllActors(); //keep the result in model attribute
	 * map.put("resultMsg", msg); map.put("listActors", list); //return LVN return
	 * "show_report"; }
	 */
	
	/*
	 * @PostMapping("/register") //Solution1- Implementing PRG pattern //P-Post
	 * public String registerActor(@ModelAttribute("actor")Actor
	 * actor,Map<String,Object>map) {
	 * System.out.println("ActorOperationsController.registerActor()"); //use
	 * service String msg=actorService.registerActor(actor); //keep the result in
	 * model attribute map.put("resultMsg", msg); //return LVN return
	 * "redirect:report"; //R-Redirect //return "forward:report"; }
	 */
	
	/*
	 * @PostMapping("/register") //Solution2- Implementing PRG pattern //P-Post
	 * public String registerActor(@ModelAttribute("actor")Actor
	 * actor,RedirectAttributes attrs) {
	 * System.out.println("ActorOperationsController.registerActor()"); //use
	 * service String msg=actorService.registerActor(actor); //keep the result in
	 * model attribute attrs.addFlashAttribute("resultMsg", msg); //return LVN
	 * return "redirect:report"; //R-Redirect 
	 * }
	 */
	
	@PostMapping("/register") //Solution2- Implementing PRG pattern //P-Post
	public String registerActor(@ModelAttribute("actor")Actor actor,HttpSession ses) {
		System.out.println("ActorOperationsController.registerActor()");
		//use service
		String msg=actorService.registerActor(actor);
		//keep the result in model attribute
		ses.setAttribute("resultMsg", msg);
		//return LVN
		return "redirect:report"; //R-Redirect
		}
	
	@GetMapping("/edit")
	public String editActorFormPage(@ModelAttribute("actor")Actor actor,@RequestParam("no")int id) {
		//use service
		Actor actor1=actorService.fetchActorById(id);
		//copy actor1 object to actor object(ModelAttribute)
		BeanUtils.copyProperties(actor1,actor);
		//return LVN (edit form page)
		return "actor_edit_form";
	}
	
	@PostMapping("/edit")
	public String editActor(@ModelAttribute("actor")Actor actor,RedirectAttributes attrs) {
		//use service
		String msg=actorService.editActor(actor);
		//keep the results in flash attributes
		attrs.addFlashAttribute("resultMsg",msg);
		//redirect the request
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public String removeActorById(@RequestParam("no")int id, Map<String,Object>map) {
		//use service
		String msg=actorService.deleteActorById(id);
		//keep the results in flash attributes
		map.put("resultMsg", msg);
		//forward the request
		return "forward:report";
		}

}


