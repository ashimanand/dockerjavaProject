package com.ashim.ashimDoker.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

	@RequestMapping("/")
	public String demo() {
		return "Hello Ashim !!";
	}
	
	
}
