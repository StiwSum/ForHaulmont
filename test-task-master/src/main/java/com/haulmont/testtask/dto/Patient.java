package com.haulmont.testtask.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String firstName; 
	private String lastName; 
	private String middleName; 
	private String phoneNumber;
	
	public Patient() {
	}
	
	public Patient(String firstName, String lastName, String middleName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + middleName;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this == obj) ? true : false;
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 43 * hash + (Id == null ? 0 : Id.hashCode());
		return hash;
	}

	@Override
	public Patient clone() throws CloneNotSupportedException {
		return (Patient) super.clone();
	}
}
