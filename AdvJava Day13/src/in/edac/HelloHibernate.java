package in.edac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.edac.Entity.Employee;
import in.edac.Entity.Student;

public class HelloHibernate {
   public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		//addStudent();
		//addEmployee();

	}
	
	public static void addStudent() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Student std1=new Student("ravi", "rdj@gmail.com", "7767862387");
		Student std2=new Student("shiv", "smk@gmail.com", "7040143146");
		Student std3=new Student("ajay", "adg@gmail.com", "9765368377");
		
		session.save(std1);
		session.save(std2);
		session.save(std3);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("3 records of student added successfully");
	}

	public static void addEmployee() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Employee emp1=new Employee("biw", "jaguar", "bhushan");
		Employee emp2=new Employee("door", "land rover", "suhas");
		Employee emp3=new Employee("cabin", "volvo", "manoj");
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("3 records of employee added successfully");
	}

}
