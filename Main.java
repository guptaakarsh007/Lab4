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
				case 5: System.exit();
						break;
				default: System.out.println("wrong choice");
			}
			
		}
	}
	public static void createaccount()
	{
		Random rand=new Random();
		System.out.println("enter name to create");
		String sname=sc.next();
		int age=sc.nextInt();
		int randno=rand.nextInt(1000);
		String msg=bl.createaccount(sname,randno,age);
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
		int sum=sc.nextInt();
		bl.addBal
		
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		showmenu();
	}

}
