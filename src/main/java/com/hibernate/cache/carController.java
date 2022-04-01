package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class carController {

	public static void main(String[] args) {
		
		Cars c1 = new Cars("Ford", "Endover", 45000);
		Cars c2 = new Cars("Toyato", "Fortuner", 6000000);
		Cars c3 = new Cars("KIA", "Seltos", 1);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
//		session.persist(c1);
//		session.persist(c2);
//		session.persist(c3);
		Cars car1 = session.get(Cars.class, 1);
		System.out.println(car1);
		car1 = session.get(Cars.class, 1);
		System.out.println(car1);
		
		session.getTransaction().commit();
		session.close();
		
		session = factory.openSession();
		session.beginTransaction();
		
		car1 = session.get(Cars.class, 1);
		System.out.println(car1);
		
		session.getTransaction().commit();
		session.close();
		
		factory.close();
		

	}

}
