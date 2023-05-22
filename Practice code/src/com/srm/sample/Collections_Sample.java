package com.srm.sample;
import java.util.*;

public class Collections_Sample {

	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		System.out.println("LinkedList Elements:");
		System.out.println("");
		list.add("Shiny");
		list.add("Priya");
		list.add("Raj");
		list.add("Devi");
		list.add("Prakash");
      
	    Collections.sort(list);
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
