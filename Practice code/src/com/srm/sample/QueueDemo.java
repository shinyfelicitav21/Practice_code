package com.srm.sample;
import java.util.PriorityQueue;
import java.util.Iterator;
 
public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue= new PriorityQueue<String>();
		System.out.println("Queue Elements.");
		queue.add("Mani");
		queue.add("Ramya");
		queue.add("Jeeva");
		queue.add("Lathifa");
		queue.add("Maran");
		System.out.println("Head:" +queue.element());
		System.out.println("Peek:" +queue.peek());
		System.out.println("");
		System.out.println("Iterating queue elements:");
		Iterator itr= queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("");
		System.out.println("Queue after removing 2 elements:");
		Iterator<String> itr2= queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		}
}
	


