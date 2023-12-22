package com.example.firstservice.feign;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "API-GATEWAY-SERVICE")
public interface FeignClient {

	@GetMapping("/second-service/welcome")
	String secondServiceWelcome();
}
