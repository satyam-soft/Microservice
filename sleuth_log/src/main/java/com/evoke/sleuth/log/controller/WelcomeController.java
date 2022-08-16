package com.evoke.sleuth.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	Logger logger=LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String getMessage()
	{
		logger.info("getWelcome() execution started ");
		return "Hello welcome to logging service ";
	}

}
