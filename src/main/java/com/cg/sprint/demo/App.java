package com.cg.sprint.demo;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Gaurav
 */
@SpringBootApplication
public class App {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(App.class, args);
		LOG.info("End");
		LOG.warn("you got an warning");
		LOG.info("End");
		
        

	}

}
