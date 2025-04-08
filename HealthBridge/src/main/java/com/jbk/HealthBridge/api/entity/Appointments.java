package com.jbk.HealthBridge.api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointments {
	
	
	@Id
	private long id;
	private LocalDateTime appointment_date;
	private String status;
    
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "patient_id")
	private Patients patients;


	public Appointments() {
		
		
	}


	public Appointments(long id, LocalDateTime appointment_date, String status, Patients patients) {
		super();
		this.id = id;
		this.appointment_date = appointment_date;
		this.status = status;
		this.patients = patients;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public LocalDateTime getAppointment_date() {
		return appointment_date;
	}


	public void setAppointment_date(LocalDateTime appointment_date) {
		this.appointment_date = appointment_date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Patients getPatients() {
		return patients;
	}


	public void setPatients(Patients patients) {
		this.patients = patients;
	}


	@Override
	public String toString() {
		return "Appointments [id=" + id + ", appointment_date=" + appointment_date + ", status=" + status
				+ ", patients=" + patients + "]";
	}
}
