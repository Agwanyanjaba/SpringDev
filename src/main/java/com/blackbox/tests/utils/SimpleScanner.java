package com.blackbox.tests.utils;

import java.util.*;

public class SimpleScanner {
	private String username;
	private Scanner userInputs;
	
	public String getUserName() {
		return username;		
	}
	
	public void setUserName() {
		//Initialize userInput object
		userInputs = new Scanner(System.in);
		System.out.println("Enter Username");
		String name = userInputs.next();
		this.username = name;
	}

}
