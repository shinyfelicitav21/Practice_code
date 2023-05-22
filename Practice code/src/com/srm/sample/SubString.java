package com.srm.sample;
import java.util.*;

public class SubString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter string:");
		String s=sc.next();
		System.out.println("Enter int1:");
		int start= sc.nextInt();
		System.out.println("Enter int2:");
        int end= sc.nextInt();
        System.out.println(s.substring(start, end));
	} 

}
