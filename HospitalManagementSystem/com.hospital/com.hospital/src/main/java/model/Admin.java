package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int admin_id;
	
	@Column(name = "Admin_name")
	private String adminName;
	
	
//	@Email(message = "Please provide a valid e-mail")
//	@NotEmpty(message = "Please provide an e-mail")
	@Column(name = "email_Id")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(int admin_id, String adminName, String password) {
		super();
		this.admin_id = admin_id;
		this.adminName = adminName;
		this.password = password;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", adminName=" + adminName + ", password=" + password + "]";
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
