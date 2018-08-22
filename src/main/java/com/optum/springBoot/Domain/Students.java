package com.optum.springBoot.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students{
	
	public Students() {};

	private String emailid;

	private Long studentid;
	
	private String firstname;
	
	private String lastname;
	
	@Id
	private Long userid;
	
	public Students(String emailid,String firstname, String lastname, Long studentid, Long userid) {
		super();
		this.emailid = emailid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.studentid = studentid;
		this.userid = userid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}


	}