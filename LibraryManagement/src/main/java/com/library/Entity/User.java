package com.library.Entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="tbl_user",
		uniqueConstraints = @UniqueConstraint(
				name="user_email",
				columnNames = "user_email"))
public class User {

	@Id
	@SequenceGenerator(name="student_sequence",sequenceName="student_sequence",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "student_sequence")
	private Long user_id;
	private String user_fname; 
	private String user_lname; 
	private String user_Role; 
	@Column(nullable=false)
	private String user_email;
	private Date joining_date;
	private String Last_working_date;
	private Date Created_date;
	private String Created_by; 
	private Date Updated_Date;
	private String Updated_by;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public String getUser_Role() {
		return user_Role;
	}
	public void setUser_Role(String user_Role) {
		this.user_Role = user_Role;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public String getLast_working_date() {
		return Last_working_date;
	}
	public void setLast_working_date(String last_working_date) {
		Last_working_date = last_working_date;
	}
	public Date getCreated_date() {
		return Created_date;
	}
	public void setCreated_date(Date created_date) {
		Created_date = created_date;
	}
	public String getCreated_by() {
		return Created_by;
	}
	public void setCreated_by(String created_by) {
		Created_by = created_by;
	}
	public Date getUpdated_Date() {
		return Updated_Date;
	}
	public void setUpdated_Date(Date updated_Date) {
		Updated_Date = updated_Date;
	}
	public String getUpdated_by() {
		return Updated_by;
	}
	public void setUpdated_by(String updated_by) {
		Updated_by = updated_by;
	}
	
	
	

}
