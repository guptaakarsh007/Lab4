package com.capgemini.bl;
import com.capgemini.beans.*;

public class Businesslogic {
	
	private Account account[]=new Account[1000]; 
	private int count;
	public String createaccount(String sname, int accntno, int age,int bal) 
	{
		int f=0;
		for(int i=0;i<count;i++)
		{
			if(account[i].getAccnum()==accntno)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			return "no";
		}
		else
		{
			account[count]=new Account();
			account[count].setAccnum(accntno);
			account[count].setName(sname);
			account[count].setAge(age);
			account[count].setBalance(bal);
			count++;
		}
		return "yes";
	}
	public String addbalance(int accntno,int balance)
	{
		int sum=0;
		int f=0;
		for(int i=0;i<count;i++)
		{
			if(account[i].getAccnum()==accntno)
			{
				account[i].setBalance(account[i].getBalance()+balance);
				return "yes";
			}
		}
		return "no";
		
	}
	public String withdraw(int d,int e)
	{
		for(int i=0;i<count;i++)
		{
			if(account[i].getAccnum()==e)
			{
				account[i].setBalance(account[i].getBalance()-e);
				if(account[i].getBalance()<0)
				{
					return "no";
				}
				else
				{
					return "yes";
				}
			}
		}
		return "no";
	}
	public String updatedbalance(int f)
	{
		for(int i=0;i<count;i++)
		{
			if(account[i].getAccnum()==f)
			{
			System.out.println(account[i].getName());
			System.out.println(account[i].getBalance());
			System.out.println(account[i].getAge());
			return "yes";
			}
		}
		return "no";
		
	}
	
	

}
