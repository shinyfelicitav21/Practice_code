package com.srm.sample;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
   public static void main(String args[]) {
	   Stack<String> stack= new Stack<String>();
	   stack.add("Bangalore");
	   stack.add("Chennai");
	   stack.add("Salem");
	   stack.add("Erode");
	   stack.add("Vellore");
	   stack.pop();
	   System.out.println("Stack elements after pop function:"+ stack);
	   System.out.println("");
	   Iterator itr= stack.iterator();
	   
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
   }
}
