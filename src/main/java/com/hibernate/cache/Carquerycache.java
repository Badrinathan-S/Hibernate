package com.hibernate.cache;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Carquerycache {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Query q = session.createQuery("from Cars");
		q.setCacheable(true);
		List<Cars> l = q.list();
		System.out.println(l);
		
//		q = session.createQuery("from Cars");
		l = q.list();
		System.out.println(l);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
