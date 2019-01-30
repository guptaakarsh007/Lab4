package com.capgemini.main;
import com.capgemini.beans.*;
import com.capgemini.bl.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static Businesslogic bl=new Businesslogic();
	static Scanner sc=new Scanner(System.in);
	public static void showmenu() {
		
		while(true)
		{
			System.out.println("Type 1 to create account");
			System.out.println("Type 2 to add balance");
			System.out.println("Type 3 to withdraw balance");
			System.out.println("Type 4 to updated balance");
			System.out.println("Type 5 exit");
			
			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: createaccount();
						break;
				case 2: addbalance();
						break;
				case 3:withdraw();
						break;
				case 4:updatedbalance();
						break;
				case 5: System.exit(0);
						break;
				default: System.out.println("wrong choice");
			}
			
		}
	}
	public static void createaccount()
	{
		
		System.out.println("enter name to create");
		String sname=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter account no to create");
		int accntno=sc.nextInt();
		System.out.println("enter balance to added");
		int bal=sc.nextInt();
		
		String msg=bl.createaccount(sname,accntno,age,bal);
		if(msg=="yes")
		{
			System.out.println("account generated");
		}
		else
		{
			System.out.println("not generated");
		}
	}
	public static void addbalance()
	{
		System.out.println("enter your account no");
		int b=sc.nextInt();
		System.out.println("enter ammount to add");
		int a=sc.nextInt();
		String msg=bl.addbalance(b,a);
		if(msg=="yes")
		{
			System.out.println("balance added successfully");
		}
		else
		{
			System.out.println("account number missmatched");
		}
		
	}
		public static void withdraw()
		{
			System.out.println("enter balance to withdraw");
			int d=sc.nextInt();
			System.out.println("enter accountno to withdraw");
			int e=sc.nextInt();
			String msg1=bl.withdraw(d,e);
			if(msg1=="yes")
			{
				System.out.println("withdrawl successfull");
			}
			else
				System.out.println("not success");
		}
	
		public static void updatedbalance()
		{
			System.out.println("enter account number");
			int f=sc.nextInt();
			String msg2=bl.updatedbalance(f);
			if(msg2=="yes")
			{
				System.out.println("successfull");
			}
			else
				System.out.println("not matched");
		}
	
	
	
	
	public static void main(String[] args)
	{
		showmenu();
	}

}
