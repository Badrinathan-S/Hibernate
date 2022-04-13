package com.hibernate.relationships;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class oneToOneController {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Asset a1 = new Asset("House", 200000);
		Person p1 = new Person("jack", 42, "male", a1);

		session.persist(p1);
		session.persist(a1);

		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
