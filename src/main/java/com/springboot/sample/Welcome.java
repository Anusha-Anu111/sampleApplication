package com.springboot.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Welcome {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to SpringBoot Application";
	}
}
