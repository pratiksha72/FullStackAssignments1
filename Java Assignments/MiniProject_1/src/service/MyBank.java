package service;
public class MyBank extends AccountInit implements Bank1
{

	public void transfer(int from_acc, int to_acc, float amount) throws NotSufficientFundException,InvalidAccountNumberException
	{
		boolean flag = false;
		if (acc_Count != 0) 
		{
				for (int i = 1; i <= acc_Count; i++) 
				{
						if (from_acc == acc[x].getAccnum()) 
						{
								flag = true;
								break;
						}
						else
						{
								flag = false;
						}
				}
			  if (flag == false) 
			  {
				  	 	throw new InvalidAccountNumberException("Account number is not valid..");
			   }
			  else
			  {
				  	float amount1 = acc[from_acc].getAmount();
			  		float bal = amount1 - amount;
			  		float amount2=acc[to_acc].getAmount();
			  		float bal1 = amount2 + amount;
			  		if (bal > 500)
			  		{
			  				bal = amount1 - amount;
			  				acc[from_acc].setAmount(bal);

			  				bal1 = amount2 + amount;
			  				acc[to_acc].setAmount(bal1);
			  		} 
			  		else
			  		{
			  				throw new NotSufficientFundException("Insufficient Balance...");
			  		}	
			 }
		}
	}

	public void withdraw(int accnum, float amount)throws NotSufficientFundException,InvalidAccountNumberException
	{
		boolean flag = false;
		if (acc_Count != 0) 
		{
				for (int i = 1; i <= acc_Count; i++) 
				{
						if (accnum == acc[i].getAccnum()) 
						{
								flag = true;
								break;
						}
						else
						{
								flag = false;
						}
				}
			  if (flag == false) 
			  {
				  	 	throw new InvalidAccountNumberException("Invalid number");
			   }
			  else
			  	{
				  		float amount1 = acc[accnum].getAmount();
				  		float bal = amount1-amount;
				  		if(bal > 500) 
				  		{
				  				bal = amount1-amount;
				  				acc[accnum].setAmount(bal);
				  		}
				  		else 
				  		{
				  			throw new NotSufficientFundException("Insufficient balance.... ");
				  		}	
			  }
		}
	}

	public void deposit(int acc_no, float amount) throws InvalidAccountNumberException{
		boolean flag = false;
		if (acc_Count != 0)
		{
					for (int i = 1; i <= acc_Count; i++) 
					{
						if (acc_no == acc[i].getAccnum()) 
						{
							flag = true;
							break;
						}
						else 
						{
							flag = false;
						}
					}
				if (flag == false) 
				{
						throw new InvalidAccountNumberException("Invalid  account number");
				} 
				else 
				{
						float amt = acc[accnum].getAmount();
						float bal = amt + amount;
						acc[accnum].setAmount(bal);
				}
			}
		}

	public void checkBalance(int acc_no) throws InvalidAccountNumberException {
		boolean flag = false;
		if (acc_Count != 0)
		{
					for (int i = 1; i <= acc_Count; i++) 
					{
						if (acc_no == acc[i].getAccnum()) 
						{
							flag = true;
							break;
						}
						else 
						{
							flag = false;
						}
					}
				  if (flag == false) 
				  {
						throw new InvalidAccountNumberException("Invalid account number");
				  } 
				  else 
				  {
						String name = acc[accnum].getName();
						float amount = acc[accnum].getAmount();
						System.out.println("Name :" + name);
						System.out.println("Amount :" + amount);
				}
			}
	}
}