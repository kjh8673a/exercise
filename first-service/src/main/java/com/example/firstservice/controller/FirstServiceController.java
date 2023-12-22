package com.example.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstservice.feign.FeignClient;

@RestController
@RequestMapping("/first-service")
public class FirstServiceController {
	private final FeignClient feignClient;

	public FirstServiceController(FeignClient feignClient) {
		this.feignClient = feignClient;
	}

	@GetMapping("/welcome")
	public String welcome()	{
		System.out.println("welcome");
		String secondServiceWelcome = feignClient.secondServiceWelcome();
		return "Welcome to the First Service. " + secondServiceWelcome;
	}
}
