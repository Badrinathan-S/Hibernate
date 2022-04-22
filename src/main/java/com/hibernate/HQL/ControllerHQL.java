package com.hibernate.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ControllerHQL {

	public static void main(String[] args) {

		Iplteams team1 = new Iplteams(1, "CSK", 100, 80, 20, "dhoni");
		Iplteams team2 = new Iplteams(2, "MI", 100, 70, 30, "Rohith");
		Iplteams team3 = new Iplteams(3, "RCB", 100, 60, 40, "FAF");
		Iplteams team4 = new Iplteams(4, "KKR", 100, 50, 50, "DK");
		Iplteams team5 = new Iplteams(5, "KXIP", 100, 50, 50, "KL");
		Iplteams team6 = new Iplteams(6, "SRH", 100, 40, 60, "David");
		Iplteams team7 = new Iplteams(7, "RR", 100, 30, 70, "sanju");
		Iplteams team8 = new Iplteams(8, "GT", 100, 30, 70, "dhawan");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		session.persist(team1);session.persist(team2);session.persist(team3);session.persist(team4);
		session.persist(team5);session.persist(team6);session.persist(team7);session.persist(team8);

		session.getTransaction().commit();

		session.close();

		factory.close();

	}

}
