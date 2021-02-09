package main;
import service.MyBank;
import java.util.Scanner;

class Assignment_6
{
	
	 public static void main(String[] args) throws Exception
	 {
	 	
	 	MyBank mybank=new MyBank();
	 	int accnum;
	 	boolean flag=true;
	 	float amount=0.0f;
	 	Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println(" Menu: 1.Create Account\n   1. Details\n   2.Name and Amount");
			System.out.println("2. Check Balance\n 3.Deposit\n 4.Withdrawal\n 5.Transfer\n 6.Exit");
           		 System.out.println("Enter Your Choice:");
            		int choice= sc.nextInt();	
           		 switch(choice)
           		 {	
            			case 1:
            			 	 System.out.println("Enter Your Choice :");
           				 int c = sc.nextInt();
            			 switch(choice)
            			 {
            				case 1: 
            						mybank.accountCreate();
            						break;

            				case 2: 
   									System.out.println("Enter name:");
									String name=sc.next();
									System.out.println("Enter amount greater than 500:");
									amount=sc.nextFloat();
									if(amount<500)
									{
										System.out.println("Account is not created");
									}
            						mybank.accountCreate(name,amount);
            						break;
            			}
            			break;

            	case 2: System.out.println("Enter your  account number: ");
						accnum=sc.nextInt();
						mybank.checkBalance(accnum);
						break;

            	case 3:	System.out.println("Enter  your account number: ");
						accnum=sc.nextInt();
						System.out.println("Enter your amount: ");
						amount=sc.nextFloat();
						if(amount>50000)
    					{
    						System.out.println("Can't deposit  amount greater than 50,0000");
    					}	
						mybank.deposit(accnum,amount);
						
						break;

            	case 4: System.out.println("Enter account number: ");
						accnum=sc.nextInt();
						System.out.println("Enter your amount: ");
						amount=sc.nextFloat();
						mybank.withdraw(accnum,amount);

            			break;

            	case 5:

            			System.out.println("Enter account number from whom transfer the amount: ");
						int from_acc=sc.nextInt();
						System.out.println("Enter account number to whom transfer the amount : ");
						int to_acc=sc.nextInt();
						System.out.println("Enter your amount  to transfer :");
						amount=sc.nextFloat();
						mybank.transfer(from_acc,to_acc,amount);

						break;

            	case 6:
            		System.out.println("Thank you  for using  this application....");
        			flag=false;
        			break;

            	default:
            			System.out.println("");
						System.out.println("Please select appropriate option");

            }
	 	}while(flag);
		
	}
}