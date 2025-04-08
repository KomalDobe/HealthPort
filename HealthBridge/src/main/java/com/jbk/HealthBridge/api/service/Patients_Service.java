package com.jbk.HealthBridge.api.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.HealthBridge.api.dao.Patients_Dao;
import com.jbk.HealthBridge.api.entity.Patients;

@Service
public class Patients_Service {

	@Autowired
	 Patients_Dao dao;
		
	 public String PatientData(Patients patient) {
	  return dao.InsertData(patient);
	 }
		
	 public String DeletePatientData(int patient_id) {
	  return dao.DeletePatientData(patient_id);
	 }
		
	 public String UpdatePatientData(Patients patient) {
	  return dao.UpdatPatient(patient);
	 }
		
	 public Patients SinglePatientData(int patient_id) {
	  return dao.GetSinglePatientData(patient_id);
	 }
		
	 public List<Object> AllPatientRecord() {
	  return dao.FetchAllPatientData();
	 }
	}


