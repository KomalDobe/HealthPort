package com.jbk.HealthBridge.api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MedicalRecord {
	
    @Id
    private long record_id;
	private String diagnosis;
	private String prescription;
	private String treatment;
	private LocalDateTime date_of_record;

	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patients patients;

	public MedicalRecord() {
		
		
	}

	public MedicalRecord(long record_id, String diagnosis, String prescription, String treatment,
			LocalDateTime date_of_record, Patients patients) {
		super();
		this.record_id = record_id;
		this.diagnosis = diagnosis;
		this.prescription = prescription;
		this.treatment = treatment;
		this.date_of_record = date_of_record;
		this.patients = patients;
	}

	public long getRecord_id() {
		return record_id;
	}

	public void setRecord_id(long record_id) {
		this.record_id = record_id;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public LocalDateTime getDate_of_record() {
		return date_of_record;
	}

	public void setDate_of_record(LocalDateTime date_of_record) {
		this.date_of_record = date_of_record;
	}

	public Patients getPatients() {
		return patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "MedicalRecord [record_id=" + record_id + ", diagnosis=" + diagnosis + ", prescription=" + prescription
				+ ", treatment=" + treatment + ", date_of_record=" + date_of_record + ", patients=" + patients + "]";
	}
}
