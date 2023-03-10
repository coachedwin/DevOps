package com.nagarro.dockerAssignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	    @GetMapping("/")
	    public String getMessage() {
	        return "Hello from Docker!";
	    }
	}


