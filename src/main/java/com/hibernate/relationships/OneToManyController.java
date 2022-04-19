package com.hibernate.relationships;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyController {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Asset a1 = new Asset("House", 200000);
		Asset a2 = new Asset("Land", 500000);
		
		Person p1 = new Person("jack", 42, "male");
		
//		p1.getAssets().add(a1);p1.getAssets().add(a2);

		session.persist(p1);
		session.persist(a1);
		session.persist(a2);
		
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
