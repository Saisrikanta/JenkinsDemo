package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Welcome to DevOps";
	}
	@RequestMapping("/hello1")
	public String hello1()
	{
		return "Example of Jenkins";
	}

}
