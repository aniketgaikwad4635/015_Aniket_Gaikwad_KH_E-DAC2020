package in.edac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo2 {
  public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
  
	public static void main(String[] args) {
		Transaction tr=null;
		try {
			Session session=sessionFactory.openSession();
			tr=session.beginTransaction();
			System.out.println("before A and B inserted");
			session.save("A");
			
			session.save("B");
			
			tr.commit();
			session.close();
			System.out.println("A and B inserted");
		}
		catch(Exception e) {
			
			tr.rollback();
			e.printStackTrace();
		}

	}

}
