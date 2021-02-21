package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StudentAction {
	
     @Autowired   
	private StudentRepository studentRepository;
	
     //get- GetMapping post-PostMapping  put-PutMapping   delete0-DeleteMapping
     
     @PostMapping("/create")
     public void create(Student s) {
    	 studentRepository.save(s);   	 
     }
     
     @GetMapping("/list")
     public List<Student> getAll(){
    	 return studentRepository.findAll();
     }
     
     @GetMapping("/{id}")
     public Student getSingle(@PathVariable int id) {
    	 return studentRepository.findById(id).get();
     }
     
     @PutMapping("/{id}")
     public void updateStd(@PathVariable int id, Student s) {
    	 studentRepository.save(s);
     }
     
     @DeleteMapping("/{id}")
     public void deleteStd(@PathVariable int id) {
    	 studentRepository.deleteById(id);
     }
}
