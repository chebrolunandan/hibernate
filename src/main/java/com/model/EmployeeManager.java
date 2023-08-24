package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeManager 
{
	public String insertData (Employee e)
	{
		try
		{
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();   
		      Session session = factory.openSession();      
		      session.getTransaction().begin();   
		      session.persist(e);   
		      session.getTransaction().commit();      
		      session.close();   
		      factory.close();   
		      return "Data Inserted Successfully...";
		}
		catch(Exception ex)
		{
			return ex.getMessage();
		}
	}
}
