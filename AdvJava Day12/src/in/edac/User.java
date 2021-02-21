package in.edac;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User implements Serializable {
     public static final Long serialVersionUID=1L;   
	
     @Id
     @GeneratedValue
	private int id;
	private String userName;
	private String  email;
	private String  mobile;
	
	public User() {
		super();
	}
	
	public User(int id, String userName,String  email,String  mobile) {
		this.id=id;
		this.userName=userName;
		this.email=email;
		this.mobile=mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}