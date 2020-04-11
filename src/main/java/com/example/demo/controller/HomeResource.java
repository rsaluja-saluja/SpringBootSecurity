package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@RequestMapping("/")
	public String welcomeMessage() {
		return "Welcome Home";
	}
	
	@RequestMapping("user")
	public String userMessage() {
		return "Welcome user";
	}
	
	@RequestMapping("admin")
	public String adminMessage() {
		return "Welcome admin";
	}
}
