package com.hibernate.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class userController {

	public static void main(String[] args) {
		
		Address Presentaddr = new Address("Street name1", "City Name1", "State Name1");
		
		Address Premanentaddr = new Address("Street name2", "City Name2", "State Name2");
		
		User u1 = new User();
		
//		User u1 = new User("User Name", Presentaddr, Premanentaddr, 1234567890, "User data of birth");
//		
//		User u2 = new User("User Name2", Presentaddr, Premanentaddr, 1234567890, "User data of birth");
//		
//		User u3 = new User("User Name3", Presentaddr, Premanentaddr, 1234567890, "User data of birth");
//		
//		User u4 = new User("User Name4", Presentaddr, Premanentaddr, 1234567890, "User data of birth");
		
		u1.setName("User Name");u1.setNumber(1234567890);u1.setDOB("User DOB");
		
		u1.getAddress().add(Premanentaddr);u1.getAddress().add(Presentaddr);
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		session.save(u1);
//		session.save(u2);session.save(u3);session.save(u4);
		
		session.getTransaction().commit();
		
		session.close();
		
		factory.close();

	}

}
