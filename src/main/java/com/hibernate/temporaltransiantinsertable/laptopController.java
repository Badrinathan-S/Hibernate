package com.hibernate.temporaltransiantinsertable;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class laptopController {

	public static void main(String[] args) {
		Laptop lap = new Laptop("E200", new Date("5/04/2022"), "Dell", 123456);
		
		SessionFactory factory  = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		session.persist(lap);
		
		session.getTransaction().commit();
		
		session.close();
		
		factory.close();
	}

}
