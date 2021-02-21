package in.edac;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo6 {
	public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		//read
		dqlsqldemo();
		//dqlsqldemo3();
	}
	
	
	public static void dqlsqldemo() {
		Session session=sessionFactory.openSession();
		
		String sql="SELECT * FROM user";
		List<User >lst= session.createNativeQuery(sql, User.class).getResultList();
		
		lst.stream().map(p ->p.getUserName()).forEach(System.out::println);
	}
	
	public static void dqlsqldemo3() {
		
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		String sql="INSERT INTO USER (id,userName,email,mobile) VALUES (:id,:userName,:email,:mobile)";
		session.createNativeQuery(sql, User.class)
		.setParameter("id", 1)
		.setParameter("userName", "rdj")
		.setParameter("email", "r@gmail.com")
		.setParameter("mobile","7767862387")
		.executeUpdate();
		
		tx.commit();
		session.close();
		System.out.println("record inserted");
	}

}
