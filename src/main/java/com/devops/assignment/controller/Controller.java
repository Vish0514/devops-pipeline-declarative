package com.devops.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller { 
	  
	   @GetMapping
	   public String insert() { 
	         
	      return "hello";
	   }
}