package hibernate_CRUDL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class employeeController {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Employee emp1 = new Employee("Undertaker", 50000, "developer");
		
		session.persist(emp1);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
