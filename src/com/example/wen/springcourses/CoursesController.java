package com.example.wen.springcourses;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//model, controller, view
@Controller
@RequestMapping("/courses")
public class CoursesController {
	@RequestMapping("/showForm")
	public String showForm(Model model){
		model.addAttribute("default_course",new Course());		
		return "registration-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("default_course")Course course){
		
		return "course-confirm";
	}

}
