package in.edac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.edac.Entity.Appointment;
import in.edac.Entity.Patient;

public class OneToOneApp {
 public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
 
	public static void main(String[] args) {
		createPatApp();

	}

	public static void createPatApp() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Patient pt=new Patient("ravi","rjd@gmail.com","7040122322");
		Appointment apt=new Appointment(2,true);
		
		pt.setAppointment(apt);
		
		session.save(pt);
		session.save(apt);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("patient and appointment added successfully");
	}
}
