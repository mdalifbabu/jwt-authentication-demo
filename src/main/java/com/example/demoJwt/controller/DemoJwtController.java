package com.example.demoJwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoJwtController {
	
	@RequestMapping({"/hello"})
	public String demoApi() {
		return "Hello JWT fucking Token";
	}
}
