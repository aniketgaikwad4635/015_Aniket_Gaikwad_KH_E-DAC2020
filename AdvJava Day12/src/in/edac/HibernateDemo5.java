package in.edac;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo5 {
	public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		
		Session session=sessionFactory.openSession();
		
		List<Person> lstper =session.createQuery("FROM Person", Person.class).list();
        System.out.println(lstper);
	}

}
