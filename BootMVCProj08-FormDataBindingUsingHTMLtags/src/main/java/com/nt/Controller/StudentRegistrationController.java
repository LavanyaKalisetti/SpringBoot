package com.nt.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentRegistrationController {

	@GetMapping("/register")
	public String showHomePage(@ModelAttribute("stud")Student st) {
		System.out.println("StudentRegistrationController.showHomePage()");
		System.out.println("Model class object data::"+st);
		return "student_register";
	}
	
//	@GetMapping("/register")
//	public String showStudentFormPage() {
//		System.out.println("StudentRegistrationController.showStudentFormPage()");
//		return "student_register";
		
//	}
	@PostMapping("/register")
	public String registerStudent(Map<String,Object>map,@ModelAttribute("stud")Student st) {
		System.out.println("StudentRegistrationController.registerStudent()");
		System.out.println("Model class object data::"+st);
		
		map.put("info", st);
		
		//generate result
		String grade=null;
		if(st.getAvg()>=70) 
			grade= "first class with dis";
		else if(st.getAvg()>=60)
			grade= "first class";
		else if(st.getAvg()>=50)
			grade= "second class";
		else if(st.getAvg()>=35)
			grade= "third class";
		else
			grade="Fail";
		
		map.put("result",grade);
		return "show_result";
			
}
}
