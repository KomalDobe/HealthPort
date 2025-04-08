package com.jbk.HealthBridge.api.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patients {
	
	@Id
	private long patient_id;
	private String name;
	private int age;
	private String gender;
	private long contact_num;
	private String address;
	
	
	@OneToMany(mappedBy = "patients",cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
	private List<MedicalRecord> medicalRecords;
	
	@OneToMany(mappedBy = "patients",cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
	private List<Appointments> appointments;

	public Patients() {
		
		
	}

	public Patients(long patient_id, String name, int age, String gender, long contact_num, String address) {
		super();
		this.patient_id = patient_id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact_num = contact_num;
		this.address = address;
	}

	public long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(long patient_id) {
		this.patient_id = patient_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getContact_num() {
		return contact_num;
	}

	public void setContact_num(long contact_num) {
		this.contact_num = contact_num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patients [patient_id=" + patient_id + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", contact_num=" + contact_num + ", address=" + address + "]";
	}

	
	

}
