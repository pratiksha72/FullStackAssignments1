package service;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import bean.Product;
import java.io.*;

@SuppressWarnings("serial")
public class ProductService implements Serializable
{
	 	List<Product> pd=new ArrayList<>();
	 	Product j;
	 	
	 	public List<Product> diplayProduct()
	 	{
	 		return pd;
	 	}

	 	public void addProduct(int pid, String pname, float price) 
	 	{
	 			Product product=new Product();
				product.setPid(pid);
				product.setPname(pname);
				product.setPrice(price);
				try 
				{
				pd.add(product);
				FileOutputStream fout=new FileOutputStream("info.txt");  
			 	ObjectOutputStream out=new ObjectOutputStream(fout);  
			 	out.writeObject(pd);  
			 	out.flush(); 
			 	 out.close();    
			 	  }
				catch(Exception e)
				{System.out.println(e);
				}  

	 	}
	 	public Product updateProduct(int pid, float price) 
	 	{
	 		for(Product i:pd) {
	 			if(pid==i.getPid()) 
	 			{
	 				i.setPrice(price);
	 				j=i;
	 			}
	 		}
	 		return j;
	 	}
	 	
	 	public int deleteProduct(int pid) 
	 	{
	 		int flag=0;
	 		for(Product i:pd) 
	 		{
	 			if(pid==i.getPid()) {
	 				j=i;
	 			flag=1;
	 			}
	 		}
	 		if(flag==1) {
				pd.remove(j);
				return 1;
			}else {
				return 0;
			}
		
	 	}
	 	
	 	public float productPrice(int pid) 
	 	{
	 		for(Product i:pd)
	 		{
	 			if(pid==i.getPid()) 
	 			{
	 				i.getPrice();
	 				j=i;
	 			}
	 	}
	 		return j.getPrice();
	 	}
}