
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductAction {

	@GetMapping("/first")
	public int prod1() {
		return 5555;
	} 
	
	@GetMapping("/second")
	public String prod2() {
		return "string from product action  of method prod2............we use same mapping but for that ur class should different";
	} 
}
