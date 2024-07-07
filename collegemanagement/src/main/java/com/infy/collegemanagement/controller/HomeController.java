package com.infy.collegemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
	public String method1() {
		return "Hello Mr.Santosh,Welcome to first springboot application";
	}
}
