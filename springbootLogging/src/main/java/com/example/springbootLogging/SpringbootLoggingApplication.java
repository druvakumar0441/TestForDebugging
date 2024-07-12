package com.example.springbootLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootLoggingApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringbootLoggingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoggingApplication.class, args);
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.warn("this is warn message");
		logger.error("this is error message");
	}

	@RequestMapping("/welcome")
	public String welcomeLogging() {
		logger.info("this is info message inside welcome methode");
		return "welCome to Logging from Main..........";
		
	}
}
