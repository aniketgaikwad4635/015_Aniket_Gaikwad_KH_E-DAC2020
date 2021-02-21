package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentAction {
    @Autowired
	private StudentRepository studentRepository;
    
    @GetMapping("/home")
    public ModelAndView showHome() {
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("home");
    	return mv;
    }
    
    @GetMapping("/")
	public ModelAndView registerView() {
		ModelAndView mv = new ModelAndView("register");
		
		return mv;
	}
    @GetMapping("/register")
    public ModelAndView regist(Student s) {
    	ModelAndView mv=new ModelAndView("register");
    	
    	studentRepository.save(s);
    	mv.addObject("q", "1");
    	
    	return mv;
    }
}
