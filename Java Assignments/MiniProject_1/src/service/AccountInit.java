package service;
import bean.Account;
import java.util.Scanner;

abstract class AccountInit
{
	String name;
	float amount;
	
	public static int acc_Count=0;
	public static int accnum=100;
	
	Scanner sc = new Scanner(System.in);
	public Account acc[]=new Account[10];
	int x,y;

	public void accountCreate()
	{	
			if(AccountInit.accnum<10)
			{ 
				name="Unknown";
				amount=500;
				 x=AccountInit.accnum;
				acc[x] = new Account(AccountInit.accnum,name,amount);
				display(x);
				AccountInit.accnum++;
				acc_Count++;
			}
			else
			{
				System.out.println("Account limit is 10");
			}
		
	} 

	public void accountCreate(String name,float amount)
	{	
		if(AccountInit.accnum < 10)
		{

			 y=AccountInit.accnum;
			this.name = name;
			do {
				if(amount > 500) 
				{
					this.amount = amount;
				}
				else {
					System.out.println("Minimum balance must be 500 rs ");
					
					this.amount=sc.nextFloat();
					
				}
			}while(this.amount < 500);
			

			acc[y] = new Account(AccountInit.accnum,this.name,this.amount);
			display(y);
			AccountInit.accnum++;
			acc_Count++;
		}
		else
		{
			System.out.println("Aaccount limit is only 10");
		}
	}

	void display(int i)
{
		System.out.println("Name :=   "+acc[x].getName());
		System.out.println("Account number :"+acc[x].getAccnum());
		System.out.println("Balance :"+acc[x].getAmount());
}

	abstract void transfer(int from_acc,int to_acc,float amount)throws NotSufficientFundException, InvalidAccountNumberException;
}
