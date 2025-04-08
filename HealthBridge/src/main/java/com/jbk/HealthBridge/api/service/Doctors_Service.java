package com.jbk.HealthBridge.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.HealthBridge.api.dao.Doctors_Dao;
import com.jbk.HealthBridge.api.entity.Doctors;

@Service
public class Doctors_Service {
	@Autowired
	 Doctors_Dao dao;
	
	public String AddDoctor(Doctors doctor) {
		return dao.InsertData(doctor);
	}
	
	public String DeleteDoctorData(int doctor_id) {
		  return dao.DeleteDoctorData(doctor_id);
		 }
			
		 public String UpdateDoctorData(Doctors doctor ) {
		  return dao.UpdateDoctor(doctor);
		 }
			
		 public Doctors SingleDoctorData(int doctor_id) {
		  return dao.GetSingleDoctorData(doctor_id);
		 }
			
		 public List<Object> AllDoctorRecord() {
		  return dao.FetchAllDoctorData();
		 }
		}


