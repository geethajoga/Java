package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PatientAuthentication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pAId;
	
	@Column(name="email_Id")
	private String emailId;
	
	@Column(name= "p_Key")
	private String key;

	public PatientAuthentication() {
		super();
	}

	public PatientAuthentication(String emailId, String key) {
		super();
		this.emailId = emailId;
		this.key = key;
	}

	public long getpAId() {
		return pAId;
	}

	public void setpAId(long pAId) {
		this.pAId = pAId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
	

