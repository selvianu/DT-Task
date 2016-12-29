package com.niit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CANDIDATE")
public class Candidate {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@Column(name="email_id")
	private String emailId;
	private String password;
	private String address;
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.trim().isEmpty()) {
			System.out.println("Enter Valid Name");
		}
		this.name = name;
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

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password
				+ ", address=" + address + "]";
	}

}
