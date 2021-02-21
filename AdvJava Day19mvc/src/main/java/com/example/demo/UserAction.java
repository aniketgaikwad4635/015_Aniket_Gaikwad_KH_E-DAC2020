package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserAction {

	@GetMapping("/show")
	public String showHello() {
		
		return "hello";
	}
	
	@GetMapping("/hi")
	public ModelAndView showhi() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hi");
		return mv;
	}
	
	@GetMapping("/single")
	public ModelAndView getSingle() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		
		User user=new User(1,"amit","am@gmail.com","8888888080");
				
		mv.addObject("user", user);
		
		return mv;
	}
	
	@GetMapping("/list")
	public ModelAndView getList() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("about");
		
		User u1=new User(1,"amit","am@gmail.com","8888888080");
		User u2=new User(2,"akshay","at@gmail.com","8856145080");
		User u3=new User(3,"ajit","ss@gmail.com","8866778899");
		
		List<User> userList=new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
				
		mv.addObject("userList", userList);
		
		return mv;
	}
}
