package com.jbk.HealthBridge.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.HealthBridge.api.dao.Hospital_Dao;
import com.jbk.HealthBridge.api.dao.Patients_Dao;
import com.jbk.HealthBridge.api.entity.Hospital;
import com.jbk.HealthBridge.api.entity.Patients;

@Service
public class Hospital_Service {

	
	@Autowired
	 Hospital_Dao dao;
		
	public String HospitalData(Hospital hospital) {
		  return dao.InsertData(hospital);
		 }
		
	 public String DeleteHospitalData(int hospital_id) {
	  return dao.DeleteHospitalData(hospital_id);
	 }
		
	 public String UpdateHospitalData(Hospital hospital) {
	  return dao.UpdatHospital(hospital);
	 }
		
	 public Hospital SingleHospitalData(int hospital_id) {
	  return dao.GetSingleHospitalData(hospital_id);
	 }
		
	 public List<Object> AllHospitalRecord() {
	  return dao.FetchAllHospitalData();
	 }
}
