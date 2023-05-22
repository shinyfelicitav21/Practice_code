package com.srm.sample;
import java.util.*;
import java.lang.String;

public class StringIntroduction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String A= "Shiny";
		String B= "Sweety";
	
		System.out.println("Sum of length: " +A.length()+B.length());
	    System.out.println(A.compareTo(B)>0?"Yes\n": "No");
	    
	    System.out.println("Concating words: " +A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+ B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
         
	}

}
