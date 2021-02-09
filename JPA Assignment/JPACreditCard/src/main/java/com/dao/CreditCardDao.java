package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bean.CreditCard;




public class CreditCardDao
{
	public List<CreditCard> getAllProduct()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPACreditCard");
		EntityManager manager=emf.createEntityManager();
		Query qry=  manager.createQuery("select p from CreditCard  p");
		
		@SuppressWarnings("unchecked")
		List<CreditCard> listOfProduct=qry.getResultList();
		return listOfProduct;
	}
	
	public void storeProduct(CreditCard pp)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPACreditCard");
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		tran.begin();
		manager.persist(pp);  //store product db
		tran.commit();
		System.out.println("Record stored  successfully...");
		
	}
	
	public void deleteDetails(int id) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACreditCard");   // Connection in JDBC 
		EntityManager manager = emf.createEntityManager();					// Statement or PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		
		CreditCard p	= manager.find(CreditCard.class, id);			// primary key	if record is available automatically convert record to object 
		if(p==null) {															// select * from product where pid =1
			System.out.println("details  is not present");
		}else {
			tran.begin();
						manager.remove(p);						// delete from product where pid = 1;
			tran.commit();
			System.out.println("Record deleted successfully");
		}
	}
	public void updateProduct(CreditCard pp) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACreditCard");   // Connection in JDBC 
		EntityManager manager = emf.createEntityManager();					// Statement or PreparedStatement 
		EntityTransaction tran = manager.getTransaction();
		
		CreditCard p	= manager.find(CreditCard.class, pp.getCredit_card_num());			// primary key
		if(p==null) 
		{
			System.out.println("Product is not present");
		}
		else 
		{
			tran.begin();
						
						p.setCredit_card_num(p.getCredit_card_num());
						p.setAcc_num(p.getAcc_num());
						p.setCust_id(p.getCust_id());
						p.setPassword(p.getPassword());
						p.setDebit_card_num(p.getDebit_card_num());
						
						manager.merge(p);									//update price using pid column 
			tran.commit();
			System.out.println("Record updated successfully");
		}
	}
	
	
	
	
	
}