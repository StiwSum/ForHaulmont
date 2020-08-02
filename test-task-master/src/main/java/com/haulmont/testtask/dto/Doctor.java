package com.haulmont.testtask.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String firstName; 
	private String lastName; 
	private String middleName; 
	private String specialization; 
	
	
	public Doctor(String firstName, String lastName, String middleName, String specialization) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.specialization = specialization;
	}
	
	public Doctor() {
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
	public Doctor clone() throws CloneNotSupportedException {
		return (Doctor) super.clone();
	}
}
