package in.edac.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Patient {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ptId;
	private String ptName;
	@Column(nullable=false, unique=true)
	private String ptEmail;
	@Column(nullable=false, unique=true)
	private String ptMobile;
	
	@OneToOne
	private Appointment appointment;
	
	public Patient() {
		super();
	}
	
	public Patient(String ptName,String ptEmail,String ptMobile) {
		this.ptName=ptName;
		this.ptEmail=ptEmail;
		this.ptMobile=ptMobile;
	}

	public int getPtId() {
		return ptId;
	}

	public void setPtId(int ptId) {
		this.ptId = ptId;
	}

	public String getPtName() {
		return ptName;
	}

	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public String getPtEmail() {
		return ptEmail;
	}

	public void setPtEmail(String ptEmail) {
		this.ptEmail = ptEmail;
	}

	public String getPtMobile() {
		return ptMobile;
	}

	public void setPtMobile(String ptMobile) {
		this.ptMobile = ptMobile;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	
	
	
}
