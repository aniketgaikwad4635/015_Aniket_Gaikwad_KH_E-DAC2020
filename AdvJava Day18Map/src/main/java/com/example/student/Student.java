package com.example.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stdId;
	private String stdName;
	private String stdMob;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String stdName, String stdMob) {
		super();
		this.stdName = stdName;
		this.stdMob = stdMob;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdMob() {
		return stdMob;
	}

	public void setStdMob(String stdMob) {
		this.stdMob = stdMob;
	}
	
	
	
	
}
