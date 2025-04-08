package com.jbk.HealthBridge.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.HealthBridge.api.dao.Appointments_Dao;
import com.jbk.HealthBridge.api.entity.Appointments;

@Service
public class Appointments_Service {
	
	@Autowired
	 Appointments_Dao dao;
		
	 public String AppointmentData(Appointments appointment) {
	  return dao.insertData(appointment);
	 }
		
	 public String DeleteAppointmentData(int appointment_id) {
	  return dao.DeleteAppointmentData(appointment_id);
	 }
		
	 public String UpdateAppointmentData(Appointments appointment) {
	  return dao.UpdateAppointment(appointment);
	 }
		
	 public Appointments SingleAppointmentData(int appointment_id) {
	  return dao.GetSingleAppointmentData(appointment_id);
	 }
		
	 public List<Object> AllRecordAppointment() {
	  return dao.FetchAllAppointmentData();
	 }
	}



