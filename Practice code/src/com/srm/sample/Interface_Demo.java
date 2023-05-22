package com.srm.sample;
import java.util.Scanner;
import java.time.LocalDate;
import java.io.*;

 interface Account{
	void details();
}
interface Process{
	void calc();
}
class withdrawn implements Account, Process{
	int total= 5000;
	int withdraw, balance;
	Scanner sc= new Scanner(System.in);
   public void display() {
	System.out.println("Amount to be withdrawn:");
	withdraw=sc.nextInt();
	System.out.println("Your amount" +withdraw+ "has been withdrawn.");
	balance= total- withdraw;
	System.out.println("Balance amount:"+ balance);
	System.out.println("");
	 System.out.println("Thank You.");
}
    
	@Override
	public void details() {
		
		System.out.println("Please enter the following details for processing bank accont details..");
		String name, location;
		int acc_no, date;
		System.out.println("Name:");
		name= sc.next();
		System.out.println("Account Number:");
		acc_no= sc.nextInt();
		System.out.println("Location:");
		location= sc.next();
		LocalDate ldate = LocalDate.now();  
		   System.out.println("Date:"+ ldate);
		   System.out.println("");
		   System.out.println("Select the option to be processed.");
		   System.out.println("----------------------------------");

		   if(true)
		   {
		   System.out.println("01 - Deposit");
		   System.out.println("02 - Withdraw");
		   System.out.println("");
		   System.out.println("Enter your choice:");

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   int choice = 0;
		   try {
			choice = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   switch(choice)
		   {
		   
		   case 1:
			   
		           calc();
		   break;

		   case 2:
		   	       display();
		   break;
		   default: 
			   System.out.println("Invalid");
		   }
		   }
	}

	@Override
	public void calc() {
     int amount;
    System.out.println("Amount to be deposited:");
    amount= sc.nextInt();
    if(amount>10000&& amount<=50000) {
    	System.out.println("Your amount"  +amount+  "is deposited..");
    }
    else {
    	System.out.println("Invalid amount!");
    	
    }
    System.out.println("");
    System.out.println("Thank You!!!");
	}
}
public class Interface_Demo {
	public static void main(String[] args) {
	withdrawn w= new withdrawn();
	w.details();
	w.calc();
	w.display();
		}
}


