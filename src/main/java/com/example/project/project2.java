package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class project2 {	
	@GetMapping("/Welcome2")
public String getMyFav(){
		String color="Green" ;
		return "My favorite color is "+color;
}
}
