package hibernate_CRUDL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class employeeController {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Badri", 50000, "developer");
		Employee emp2 = new Employee("viki", 50000, "Gamer");
		Employee emp3 = new Employee("vishnu", 50000, "Killer");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		//create
		session.save(emp1);
		session.persist(emp2);
		session.persist(emp3);
		
		//read
		System.out.println(session.get(Employee.class, 1));
		
		//update
		emp3.setDesignation("star");
		
		//delete
		session.delete(emp1);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
