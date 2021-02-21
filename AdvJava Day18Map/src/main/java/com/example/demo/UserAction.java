package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usertp")
public class UserAction {

	@GetMapping("/first")
	public int user1() {
		return 100;
	} 
	
	@GetMapping("/second")
	public String user2() {
		return "string from Usertp action  of method user2";
	} 
}
