package com.srm.sample;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
	//Get and set using array list
		al.add("Mango");
		al.add("Pineapple");
		al.add("Fig");
		al.add("Mango");
		al.add("Strawberry");
		System.out.println("ArrayList Elements:" +al);
		
		System.out.println("Returning index element(1):" +al.get(1));
		al.set(1, "Cherry");
		System.out.println("");
		System.out.println("New ArrayList Elements:");
		for(String fruit:al) {
			System.out.println(fruit);
		}
		

	}

}
