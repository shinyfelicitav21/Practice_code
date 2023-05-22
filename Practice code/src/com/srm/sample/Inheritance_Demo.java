package com.srm.sample;

import java.util.Scanner;

class Student{
	String name, dept, location;
	int id;
    Scanner sc= new Scanner(System.in);
    void  getDetails() {
		System.out.println("Please enter the following details.");
		System.out.println("Student id:");
		id= sc.nextInt();
		System.out.println("Student name:");
		name= sc.next();
		System.out.println("Department:");
		dept= sc.next();
		System.out.println("Location:");
		location= sc.next();
		System.out.println("");
	}
}
class Details extends Student{
	void show() {
	 System.out.println("STUDENT DETAILS:");
	 //System.out.println("------------------------");
	 System.out.println("ID:" +id);
	 System.out.println("Name:" +name);
	 System.out.println("Department:" +dept);
	 System.out.println("Location:" +location);
	}
}

public class Inheritance_Demo {

	public static void main(String[] args) {
		Details d =new Details();
		d.getDetails();
		d.show();

	}

}
