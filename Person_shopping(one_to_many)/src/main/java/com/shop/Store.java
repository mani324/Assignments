package com.shop;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {
   
	public static void main(String[] args) {
	
	   SessionFactory sf;
	   sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session s=sf.openSession();
       Transaction tr=s.beginTransaction();
       try
       {
    	  Person p=new Person();
    	  p.setName("Kabilan");
    	  Shopping shop1=new Shopping();
    	  shop1.setShop_Name("VM Supermarket");
    	  shop1.setShop_Location("Chennai Tamilnadu");
    	  shop1.setItem("Groceries");
    	  
    	  Shopping shop2=new Shopping();
    	  shop2.setShop_Name("VM Textile");
    	  shop2.setShop_Location("Chennai Tamilnadu");
    	  shop2.setItem("shirt");
    	  
    	  Shopping shop3=new Shopping();
    	  shop3.setShop_Name("VM TechMart");
    	  shop3.setShop_Location("Chennai Tamilnadu");
    	  shop3.setItem("Laptop");
    	  
    	  Shopping shop4=new Shopping();
    	  shop4.setShop_Name("VM Foods");
    	  shop4.setShop_Location("Chennai Tamilnadu");
    	  shop4.setItem("Meals Parsel");
    	  ArrayList<Shopping>sp=new ArrayList<>();
    	  sp.add(shop1);
    	  sp.add(shop2);
    	  sp.add(shop3);
    	  sp.add(shop4);
    	  p.setShop(sp);
    	  s.save(p);
    	  tr.commit();
    	  s.close();
    	  System.out.println("Data added sucessfully......!!!!");
       }
       catch(HibernateException h)
       {
    	   System.out.println("Hibernate Error is......!!"+h);
       }
	}

}
