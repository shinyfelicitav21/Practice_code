package com.srm.sample;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> deque= new ArrayDeque<String>();
		System.out.println("Deque Elements:");
		deque.add("Shiny");
		deque.add("Vishwa");
		deque.add("Raj");
		deque.add("Malar");
		deque.add("Meena");
         for(String str:deque) {
        	 System.out.println(str);
         }
	}

}
