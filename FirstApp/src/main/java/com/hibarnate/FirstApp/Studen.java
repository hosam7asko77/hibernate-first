package com.hibarnate.FirstApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Studen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id ;
	@Column(name="first_name")
	private String fristName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	public Studen() {
	}
	public Studen(String fristName, String lastName, String email) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Studen [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	

}
