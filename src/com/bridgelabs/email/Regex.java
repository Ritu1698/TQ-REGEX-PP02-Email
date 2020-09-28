package com.bridgelabs.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) 
    { 
  
		System.out.println("Welcome to Email problem");
        String regex = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[(com)|(co)|(net)]+(?:\\.[a-z]{2,}){0,1}$";
        
        String email = "abc.xyz@bridgelabz.co"; 
        String email1 = "abc.xyz@bridgelabz.co"; 
       
        
        Pattern pattern = Pattern.compile(regex); 
  
        
        
        Matcher matcher = pattern.matcher(email); 
        Matcher matcher1 = pattern.matcher(email1); 
        System.out.println("Pattern match is: " + matcher.find()); 
        System.out.println("Pattern match is: " + matcher1.find()); 
        
    } 

}
