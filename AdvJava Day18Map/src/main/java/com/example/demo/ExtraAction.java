package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/extra")
public class ExtraAction {

	@GetMapping("/create-user")
	public List<User> getAllUser(){
		User u1=new User(1,"akshay","8805372272");
		User u2=new User(2,"sushant","879600609");
		
		List <User> ulst=new ArrayList<User>();
		ulst.add(u1);
		ulst.add(u2);
		return ulst;
	}
	
	@PostMapping("/{id}")
	public User getUser(@PathVariable int id){
		User u=new User(id,"ganesh","8880808080");
		return u;
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, User user) {
		return user;
	}
	
	@DeleteMapping("/{id}")
	public int deleteUser(@PathVariable int id){
		return id;
	}
	
}
