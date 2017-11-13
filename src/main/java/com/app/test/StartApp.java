package com.app.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"com.app.test"})
@PropertySource("classpath:app.properties")
public class StartApp {
	    public static void main(String[] args) {
	    	SpringApplication.run(StartApp.class, args);
	    }
}
