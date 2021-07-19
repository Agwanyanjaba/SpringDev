package com.blackbox.tests;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blackbox.tests.utils.SimpleScanner;



@SpringBootApplication
public class TestsApplication {
	

	static SimpleScanner scanner = new SimpleScanner();
	

	public static void main(String[] args) {
		
		
		SpringApplication.run(TestsApplication.class, args);
		scanner.setUserName();
		System.out.println("Username is: "+scanner.getUserName());

	}

}
