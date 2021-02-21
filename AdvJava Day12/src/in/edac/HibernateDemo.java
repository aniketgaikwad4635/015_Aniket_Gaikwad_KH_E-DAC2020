package in.edac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

		Session session=sessionFactory.openSession();
		System.out.println("db hibernate connected");
		session.close();
	}

}
