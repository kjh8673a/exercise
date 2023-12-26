package com.example.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstservice.feign.FeignDemoClient;

@RestController
@RequestMapping("/first-service")
public class FirstServiceController {
	private final FeignDemoClient feignClient;

	public FirstServiceController(FeignDemoClient feignClient) {
		this.feignClient = feignClient;
	}

	@GetMapping("/welcome")
	public String welcome()	{
		return "Welcome to the First Service.";
	}

	@GetMapping("/feign")
	public String feign() {
		String secondServiceWelcome = feignClient.secondServiceWelcome();
		return secondServiceWelcome + " - from First Service.";
	}


}
