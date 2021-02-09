package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import bean.Employee;
import service.EmployeeSortById;
import service.EmployeeSortName;
import service.EmployeeSortSalary;

public class EmpTest
{
	int ch;

	public static void main(String[] args)
	{
		List<Employee> listOfEmp = new ArrayList<>();
			
			System.out.println("Enter how many  records you want to store?");
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			for(int i=0;i<n;i++) {
			System.out.println("Enter id:");
			int id=input.nextInt();
			System.out.println("Enter  name:");
			String name =input.next();
			System.out.println("Enter  salary:");
			float salary=input.nextFloat();
			listOfEmp.add(new Employee(id, name, salary));
			}
			System.out.println("Before Sorting");
			for(Employee emp : listOfEmp) 
			{
				System.out.println(emp);
			}
			
		int ch;
		do 
		{
			System.out.println(" Menu:\n 1.Sort By Id\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("2. Sort By Name\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("3. Sort By Salary\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("Enter your Choice :");
	       int choice = input.nextInt();	
	       switch(choice)
           {	
           		case 1:
           					System.out.println("Enter your Choice :");
           					int choice1 = input.nextInt();
           					switch(choice1)
           					{
           					case 1: 	
         							Collections.sort(listOfEmp,new EmployeeSortById());			// using comparator 
         							System.out.println();
         							System.out.println("After Sorting:");
         							for(Employee emp : listOfEmp) 
         							{
         								System.out.println(emp);
         							
         							}
         							break;
         							
           					case 2: 
         							Collections.sort(listOfEmp,new EmployeeSortById());			// using comparator 
         							System.out.println();
         							System.out.println("After Sorting:");
         							Collections.reverse(listOfEmp);
         							for(Employee emp : listOfEmp) 
         							{
         								System.out.println(emp);
 		    	
         							}
         							break;
           					}
           					break;
           					
           		case 2:
   							System.out.println("Enter your Choice :");
   							choice1 = input.nextInt();
   							switch(choice1)
   							{
   							case 1: 	
   									Collections.sort(listOfEmp,new EmployeeSortName());			// using comparator 
   									System.out.println();
   									System.out.println("After Sorting");
   									for(Employee emp : listOfEmp) 
   									{
   										System.out.println(emp);
 		    	
   									}
   									break;
 							
   							case 2: 
   									Collections.sort(listOfEmp,new EmployeeSortName());			// using comparator 
   									System.out.println();
   									System.out.println("After Sorting");
   									Collections.reverse(listOfEmp);
   									for(Employee emp : listOfEmp) 
   									{
   										System.out.println(emp);
	    	
   									}
   									break;
   							}
   							break;
           		case 3:
           					System.out.println("Enter your Choice :");
           					choice = input.nextInt();
           					switch(choice)
           					{
           					case 1: 	
           							Collections.sort(listOfEmp,new EmployeeSortSalary());			// using comparator 
           							System.out.println();
 							System.out.println("After Sorting");
 							for(Employee emp : listOfEmp) 
 							{
 								System.out.println(emp);
 							
 							}
 							break;
 							
   					case 2: 
 							Collections.sort(listOfEmp,new EmployeeSortSalary());			// using comparator 
 							System.out.println();
 							System.out.println("After Sorting");
 							Collections.reverse(listOfEmp);
 							for(Employee emp : listOfEmp) 
 							{
 								System.out.println(emp);
	    	
 							}
 							break;
   					}
   					break;
           
           		default:
        			System.out.println("");
					System.out.println("Please select appropriate option");
					break;
           }
	       System.out.println("Do You Want to Continue 1.yes 2.no");
	        ch=input.nextInt();
		 	}while(ch!=0);	}
}
