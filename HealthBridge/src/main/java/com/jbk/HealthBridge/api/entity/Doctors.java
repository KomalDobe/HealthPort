package com.jbk.HealthBridge.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctors {
    @Id
	private int id;
	private String name;
	private String specialization;
	private long contact_number;
	private String available;
	
	public Doctors() {
		
		
	}

	public Doctors(int id, String name, String specialization, long contact_number, String available) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.contact_number = contact_number;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Doctors [id=" + id + ", name=" + name + ", specialization=" + specialization + ", contact_number="
				+ contact_number + ", available=" + available + "]";
	}

	
	

}
