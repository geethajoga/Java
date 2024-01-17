package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doctorId;
	
	@Column(name = "doctor_name")
	private String doctorName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "education")
	private String education;
	
	@Column(name = "specialization")
	private String specialization;
	
	@Column(name = "working_days")
	private String workingDays;
	
	@Column(name = "working_timings")
	private String workingTimings;
	

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(String workingDays) {
		this.workingDays = workingDays;
	}
	
	public void setWorkingTimings(String workingTimings) {
		this.workingTimings = workingTimings;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", emailId=" + emailId + ", password="
				+ password + ", education=" + education + ", specialization=" + specialization + ", workingDays="
				+ workingDays + " ,  workingTimings=" + workingTimings + "]";
	}

	public Doctor(long doctorId, String doctorName, String emailId, String password, String education,
			String specialization, String workingDays, String workingTimings) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.emailId = emailId;
		this.password = password;
		this.education = education;
		this.specialization = specialization;
		this.workingDays = workingDays;
		this.workingTimings =workingTimings;
	}

	public Doctor() {
		super();
	}
	
	

}

	

