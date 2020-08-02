package com.haulmont.testtask.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prescription")
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String description; 
	private Patient patient;
	private Doctor doctor;
	private LocalDate creationDate;
	private LocalDate expirationDate;
	private PrescriptionStatus status;
	
	public Prescription(String description, Patient patient, Doctor doctor, LocalDate creationDate,
			LocalDate expirationDate, PrescriptionStatus status) {
		this.description = description;
		this.patient = patient;
		this.doctor = doctor;
		this.creationDate = creationDate;
		this.expirationDate = expirationDate;
		this.status = status;
	}
	
	public Prescription() {
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public PrescriptionStatus getStatus() {
		return status;
	}

	public void setStatus(PrescriptionStatus status) {
		this.status = status;
	} 
	
	@Override
	public String toString() {
		return description;
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
	public Prescription clone() throws CloneNotSupportedException {
		return (Prescription) super.clone();
	}
	
}
