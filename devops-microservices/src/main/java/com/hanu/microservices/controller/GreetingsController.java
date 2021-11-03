package com.hanu.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	@GetMapping(value = "/greeting")
	public String greetPerson(@RequestParam String name) {
		
		return "Hi " + name +"!!";
	}

}
