package com.olive.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
class EmployeeRestController {
	
    @Value("${server.port}")
	private String port;
    
    @GetMapping("/data")
	public String show() {
		return "Show Emp Data  => " + port;
	}
}
