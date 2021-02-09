import java.util.Scanner;
class Employee
{

	
	int id;
	String name;
	double salary;
	Scanner sc=new Scanner(System.in);
	void read()
	{

		System.out.println("");
		System.out.println("Enter Employee Id: ");
		id=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		name=sc.next();
		System.out.println("Enter Employee Salary: ");
		salary=sc.nextDouble();
	
	}

	void calSalary()
	{
		double hra,da,pf;
		da = (salary * 7) / 100;
       		 hra = (salary * 10) / 100;
        	pf = (salary * 5) / 100;
        	salary= salary+ da + hra-pf;
	}

	void display()
	{
		System.out.println("Details  are:");
        	
        	System.out.println("Id: "+id);
        	System.out.println("Name: "+name);
        	System.out.println("Salary: "+salary);

	}

	Address add= new Address();


}

class Manager extends Employee
{

 	Scanner scan=new Scanner(System.in);
	int numEmp;

	void readMgr()
	{
		System.out.println("Enter number of employees:");
		numEmp=sc.nextInt();
		add.readAdd();

	}

	void disMgr()
	{
		System.out.println("Number of Employees ::"+numEmp);
		add.disAdd();
	}


}

class Programmer extends Employee{
	Scanner sc=new Scanner(System.in);
	String projectName;

	void readPrg()
	{
		System.out.println("Enter Name of Project:");
		projectName=scan.next();
		add.readAdd();
	}

	void disPrg()
	{
		System.out.println("Project Name is :"+projectName);
		add.disAdd();
	}


}

class Address
{	
	String city;
	String state;
	int pincode;
	Scanner scan=new Scanner(System.in);

	void readAdd()
	{

		System.out.println("Enter City name: ");
		city=scan.next();
		System.out.println("Enter State Name: ");
		state=scan.next();
		System.out.println("Enter Pincode: ");
		pincode=scan.nextInt();

	}

	void disAdd()
	{
       		 System.out.println("City Name: "+city);
       		 System.out.println("State Name: "+state);
       		 System.out.println("Pincode: "+pincode);
       		 System.out.println("");

	}


}

class Assignment_4
{

	public static void main(String[] args) 
	{

		System.out.println(" Details Manager:");
		Manager mgr=new Manager();
		mgr.read();
		mgr.readMgr();
		
		System.out.println("");
		System.out.println("Details of :Programmer");
		Programmer prg=new Programmer();
		prg.read();
		prg.readPrg();
		
		mgr.calSalary();
		mgr.display();
		mgr.disMgr();
		prg.calSalary();
		prg.display();
		prg.disPrg();
		
	}
}