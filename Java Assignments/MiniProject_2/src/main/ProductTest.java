package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import bean.Product;
import service.ProductService;
import java.io.*;

class ProductTest
{
	
	public static void main(String[] args) throws Exception
	 {
		 List<Product> pd=new ArrayList<>();
		 int id;
		 String name;
		 float price;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		ProductService ps=new ProductService();
		Product product;
	 	boolean flag=true;
	 	int ch;
	 	
			do {
				
			System.out.println("Menu :\n 1.Add Product\n 2.Update Product\n 3.Delete Product\n 4.Display Product\n 5.Product Price\n 6.Exit");
            System.out.println("Enter Your Choice :");
            ch = scan.nextInt();	
            switch(ch)
            {	
            	case 1: 	
            				System.out.println("Enter Product Id:");
            				id=scan.nextInt();
            				System.out.println("Enter Product Name:");
            				name=scan.next();
            				System.out.println("Enter Product Price:");
            				price=scan.nextFloat();
            				ps.addProduct(id,name,price);
            				
            				break;

            case 2: 	
            		
            			System.out.println("Enter Product Id:");
            			id=scan.nextInt();
            			System.out.println("Enter Product Price:");
            			price=scan.nextFloat();
            			product=ps.updateProduct(id,price);
            			try {
            			System.out.println("Product Id="+product.getPid());
						System.out.println("Product Name="+product.getPname());
						System.out.println("Product Price="+product.getPrice());
						System.out.println("Product updated succesfully");
            			}catch(Exception e)
            			{
            				System.out.println("Please enter correct product id");
            			}
						break;

            case 3:	
            			System.out.println("Enter product id:");
            			id=scan.nextInt();
            			int flag11=ps.deleteProduct(id);
            			if(flag11==1)
            			{
            				System.out.println("Product deleted succesfully");
            			}
            			else {
            				System.out.println("Please enter Correct Product Id");
            			}
						break;

            case 4: 
            			pd=ps.displayProduct();
            			System.out.println("All Products");
            			System.out.println("ID \t Name \tSalary");
            			ps.diplayProduct();
        				for(Product i1 : pd) 
        				{
        					System.out.println(i1.getPid()+"  \t"+i1.getPname()+"\t\t"+i1.getPrice());
        				}
        				break;

            case 5:	
        	   			System.out.println("Enter Product Id:");
        	   			id=scan.nextInt();
        	   			try {
        	   			float price1=ps.productPrice(id);
        	   			System.out.println("Product Price is :"+" "+price1);
        	   			}catch(Exception e)
        	   			{
        	   				System.out.println("Please enter correct product id");
        	   			}
						break;

            case 6:
            			System.out.println("Thank you  for  using  this application..");
            			flag=false;
            			break;

            default:
            			System.out.println("");
						System.out.println("Please select appropriate option");
						break;

            }
	 	}while(flag);
			
}		
}