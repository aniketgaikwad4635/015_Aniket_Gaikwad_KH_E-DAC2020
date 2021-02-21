package in.edac;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HelloHibernate1 {

	//create, update ,delete, readsingle read all
	
	public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	
	
	public void createStudent() {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student std=new Student();
		std.setUsername("ashish");
		std.setPassword("1234");
		std.setEmail("ac@gamil.com");
		std.setMobile("7709093261");
		
		session.save(std);
		tx.commit();
		session.close();
		System.out.println("record inserted success");
	}
	
	
	public void updateStudent() {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student std=new Student();
		std.setId(1);
		std.setUsername("amit");
		std.setPassword("1012");
		std.setEmail("amit@gmail.com");
		std.setMobile("9850524051");
		
		session.update(std);
		tx.commit();
		session.close();
		System.out.println("value updated");
	}
	
	public void readsingle() {
		Session session=sessionFactory.openSession();
		
		Student std=session.find(Student.class, 1);
		System.out.println(std);
		
		session.close();
	}
	
	public void readAll() {
		Session session=sessionFactory.openSession();
		
		List<Student> liststd=session.createQuery("FROM Student", Student.class ).list();
		System.out.println(liststd);
		
		session.close();
	}	
	
	public void deleteStudent() {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student std=new Student();
		std.setId(1);
		session.delete(std);
		tx.commit();
		session.close();
		System.out.println("record deleted");
	}
	
	public static void main(String[] args) {
		HelloHibernate1 hb=new HelloHibernate1();
		//hb.createStudent();
		
		//hb.updateStudent();

		//hb.readsingle();
		
		//hb.readAll();
		
		//hb.deleteStudent();
	}
	
	
	
	
	
	
	
	

}
