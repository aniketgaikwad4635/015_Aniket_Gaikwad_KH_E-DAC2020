package in.edac;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Person implements Serializable {
     public static final Long serialVerionUID=1L;
     @Id
     @GeneratedValue
     private int id;
     private String firstName;
     private String secondName;
     private String lastName;
     
     public Person() {
    	 super();
     } 
     
     public Person(int id, String firstName,String secondName,String lastName) {
    	 this.id=id;
    	 this.firstName=firstName;
    	 this.secondName=secondName;
    	 this.lastName=lastName;
     }
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
     
     
}
