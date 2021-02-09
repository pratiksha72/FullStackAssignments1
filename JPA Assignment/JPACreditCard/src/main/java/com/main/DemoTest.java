package com.main;


import java.util.List;
import java.util.Scanner;

import com.bean.CreditCard;

import com.dao.CreditCardDao;

public class DemoTest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		CreditCardDao pd=new CreditCardDao();
		int value;
		int flag=0;
		
		do
		{
			System.out.println("Enter your choice: \n1.Display  \n2.Store \n3.Delete  \n4.Update  \n5.Exit ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				
				List<CreditCard> listOfProduct=pd.getAllProduct();
				System.out.println("number of items are:"+listOfProduct.size());
				for(CreditCard pp:listOfProduct) 
				{
					System.out.println(pp);
				}
				break;
				
			case 2:
				//Store Product Details 
				CreditCard c1 = new CreditCard();
				System.out.println("Enter Credit Card Number:");
				int ccNum=sc.nextInt();
				c1.setCredit_card_num(ccNum);
				System.out.println("Enter account number:");
				int acNum=sc.nextInt();
				c1.setAcc_num(acNum);
				System.out.println("Enter customer id:");
				int cuId=sc.nextInt();
				
				c1.setCust_id(cuId);
				System.out.println("Enter password:");
				String pass=sc.next();
				c1.setPassword(pass);
				System.out.println("Enter debit card number:");
				int deNum=sc.nextInt();
				c1.setDebit_card_num(deNum);
				pd.storeProduct(c1);
				break;
				
			case 3:
				//Delete Product Details 
				System.out.println("Enter credit card number you want to delete:");
				value=sc.nextInt();
				pd.deleteDetails(value);
				break;
				
			case 4:
				//Update Query 
				CreditCard  p = new CreditCard ();
				 
				
				p.setCredit_card_num(11);
				p.setAcc_num(107);
				p.setCust_id(207);
				p.setPassword("aabbcc");
				p.setDebit_card_num(307);
				
				pd.updateProduct(p);
				
				
			case 5:
				flag=1;
				System.out.println("Thank you..");
				break;
				
			default:
				System.out.println("Wrong choice..");
				
				
				
			}
			
			
		}while(flag==0);
		
	
		
}
}
