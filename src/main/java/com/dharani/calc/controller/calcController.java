package com.dharani.calc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.calc.service.calcService;

@RestController
@RequestMapping("/api")
public class calcController {
	
	calcService service;
	
public calcController(calcService service) {
		this.service = service;
	}

@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable int a,@PathVariable int b) {
	int ans=service.add(a,b);
	return "Addition of two number is :"+ans;
	}
}
