package in.edac;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.edac.Entity.Student;

public class HibernateHqlDemo {
 public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
 
	public static void main(String[] args) {
		//demo1();
        //demo2();
		demo3();
	}

	
	public static void demo1() {
		
		Session session=sessionFactory.openSession();
		
		String hql="FROM Student";
		List<Student>stdlst=session.createQuery(hql, Student.class).list();
		stdlst.stream().map(Student::getName).forEach(System.out::println);
		
		session.close();
	}
	
   public static void demo2() {
		
		Session session=sessionFactory.openSession();
		
		String hql="SELECT s FROM Student s";
		List<Student> stdlst=session.createQuery(hql, Student.class).list();
		stdlst.stream().map(Student::getName).forEach(System.out::println);
		
		session.close();
	}
   
   public static void demo3() {
		
		Session session=sessionFactory.openSession();
		
        String hql="FROM Student s where s.id=:id";
        List<Student> stdlst=session.createQuery(hql, Student.class).setParameter("id",3 ).list();
        stdlst.stream().map(Student::getName).forEach(System.out::println);
		
		session.close();
	}
   
	
}
