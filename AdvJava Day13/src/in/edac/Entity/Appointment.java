package in.edac.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aptId;
	private int ptId;
	private boolean aptStatus;
	
	public Appointment() {
		super();
	}
	
	public Appointment(int ptId,boolean aptStatus) {
		this.ptId=ptId;
		this.aptStatus=aptStatus;
	}
	
	public int getAptId() {
		return aptId;
	}
	public void setAptId(int aptId) {
		this.aptId = aptId;
	}
	public int getPtId() {
		return ptId;
	}
	public void setPtId(int ptId) {
		this.ptId = ptId;
	}
	public boolean isAptStatus() {
		return aptStatus;
	}
	public void setAptStatus(boolean aptStatus) {
		this.aptStatus = aptStatus;
	}
	
	
}
