package com.kasibkismath.hystrix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/hystrix")
public class MainController {
	
	@HystrixCommand(commandKey="Hystrix")
	@RequestMapping("/controller")
	public String main() {
		return "Main";
	}

}
