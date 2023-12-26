package com.example.firstservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "API-GATEWAY-SERVICE")
public interface FeignDemoClient {

	@GetMapping("/second-service/welcome")
	String secondServiceWelcome();
}
