package in.edac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo4 {

	public static final SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		//create();
		//update();
		//delete();
		//updateSpecCol();

	}
	
	public static void create() {
		
	   Session session=sessionFactory.openSession();
	   Transaction tr=session.beginTransaction();
	   
	  Person p=new Person();
	  p.setFirstName("ravi");
	  p.setSecondName("dash");
	  p.setLastName("jadhav");
	  
	  session.save(p);
	  tr.commit();
	  session.close();
	  System.out.println("record inserted ");
	}

	  public static void update() {
		   Session session=sessionFactory.openSession();
		   Transaction tr=session.beginTransaction();
		   
		  Person p=new Person();
		  p.setId(1);
		  p.setFirstName("krishna");
		  p.setSecondName("pramod");
		  p.setLastName("divate");
		  
		  session.update(p);
		  tr.commit();
		  session.close();
		  System.out.println("record updated ");
	   }
	  
	  public static void delete() {
		   Session session=sessionFactory.openSession();
		   Transaction tr=session.beginTransaction();
		   
		  Person p=new Person();
		  p.setId(2);
		  
		  session.delete(p);
		  tr.commit();
		  session.close();
		  System.out.println("record deleted ");
	  }
	  
	  public static void updateSpecCol() {
		   Session session=sessionFactory.openSession();
		   Transaction tr=session.beginTransaction();
		   
		  Person p=session.find(Person.class,3);
		  p.setSecondName("dashrath");
		  
		  session.update(p);
		  tr.commit();
		  session.close();
		  System.out.println("only second name updated ");
	  }
}



 
