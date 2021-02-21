package in.edac;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.edac.Entity.Student;

public class HibernateNativeQuery {
public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
		demo7();
		demo8();
	}
	
	//
	public static void demo1() {
		Session session=sessionFactory.openSession();
		
		String sql="SELECT * FROM Student";
		List<Student>stdlst=session.createNativeQuery(sql, Student.class).list();
		
		stdlst.stream().map(Student::getName).forEach(System.out::println);
		session.close();
	}

	//?  use 1 value 2 value
	public static void demo2() {
		Session session=sessionFactory.openSession();
		
		String sql="SELECT * FROM Student where id=? AND name=?";
		List<Student>stdlst=session.createNativeQuery(sql, Student.class).setParameter(1, 3).setParameter(2,"ajay").list();
		
		stdlst.stream().map(Student::getName).forEach(System.out::println);
		session.close();
	}
	// : use "col name" "value"
	public static void demo3() {
		Session session=sessionFactory.openSession();
		
		String sql="SELECT * FROM Student where id=:id AND name=:name";
		List<Student>stdlst=session.createNativeQuery(sql, Student.class).setParameter("id", 3).setParameter("name","ajay").list();
		
		stdlst.stream().map(Student::getName).forEach(System.out::println);
		session.close();
	}
	//inserted
	public static void demo4() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		String sql="INSERT INTO Student (name, email, mobile) VALUES (:name, :email, :mobile)";
		session.createNativeQuery(sql, Student.class)
		                       .setParameter("name", "sahil")
		                       .setParameter("email", "shl@gmail.com")
		                       .setParameter("mobile", "8080808080").executeUpdate();
		session.getTransaction().commit();
		session.close();
	}
	
	//updated
	public static void demo5() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		String sql="UPDATE Student SET name=:name WHERE id=:id";
		session.createNativeQuery(sql, Student.class).setParameter("name","ashish").setParameter("id",4).executeUpdate();
		session.getTransaction().commit();
		session.close();
		System.out.println("name updated");
	}
	
	//delete
	public static void demo6() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		String sql="DELETE FROM Student WHERE id=:id";
		session.createNativeQuery(sql, Student.class).setParameter("id", 4).executeUpdate();
		session.getTransaction().commit();
		session.close();
		System.out.println("record deleted");
	}
	
	//their are two way to find out single record from table   1. getSingleElement        2.list.getValue(0)
	
	
	//see indivisual 
	public static void demo7() {
		Session session=sessionFactory.openSession();
		
		String sql="SELECT * FROM Student WHERE id=:id";
        
		Student std=session.createNativeQuery(sql, Student.class).setParameter("id", 3).getSingleResult();
		System.out.println(std);
		
		session.close();
	}
	
	
	public static void demo8() {
		Session session=sessionFactory.openSession();
		
		String sql="SELECT * FROM Student WHERE id=:id";
		List<Student>stdlst=session.createNativeQuery(sql, Student.class).setParameter("id", 3).list();
        
		Student std=stdlst.get(0);
		System.out.println(std);
		
		session.close();
	}
	
	
	
	
}
