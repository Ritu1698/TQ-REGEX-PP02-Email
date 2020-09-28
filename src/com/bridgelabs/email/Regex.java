package com.bridgelabs.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) 
    { 
  
		System.out.println("Welcome to Email problem");
        String regex = "^[a-zA-Z]+@[a-zA-Z]+.[(com)|(co)]+$"; 
        String email = "abc@bridgelabz.co"; 
       
        
        Pattern pattern = Pattern.compile(regex); 
  
        
        
        Matcher matcher = pattern.matcher(email); 
        
        System.out.println("Pattern match is: " + matcher.find()); 
        
    } 

}
