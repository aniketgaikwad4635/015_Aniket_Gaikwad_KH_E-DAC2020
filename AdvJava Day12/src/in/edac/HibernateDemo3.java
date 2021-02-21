package in.edac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo3 {
	
	public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Person p=new Person();
		p.setFirstName("abc");
		p.setSecondName("mno");
		p.setLastName("xyz");
		
		session.save(p);
		tx.commit();
		session.close();
		System.out.println("person record inserted");
	}

}
