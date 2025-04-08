package com.jbk.HealthBridge.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.HealthBridge.api.entity.Appointments;
import com.jbk.HealthBridge.api.service.Appointments_Service;

@RestController
@RequestMapping
public class Appointments_Controller {

	
	@Autowired
	 Appointments_Service service;
		
	 @PostMapping("/insertdata-appointment")
	 public String AppointmentData(@RequestBody Appointments appointment) {
	  return service.AppointmentData(appointment);
	 }
		
	 @DeleteMapping("/deletedata-appointment/{appointment_id}")
	 public String DeleteAppointmentData(@PathVariable int appointment_id) {
	  return service.DeleteAppointmentData(appointment_id);
	 }
	 @PutMapping("/updatedata-appointment")
	 public String UpdateDoctorData(@RequestBody Appointments appointment) {
	  return service.UpdateAppointmentData(appointment);
	 }
		
	 @GetMapping("/singledata-appointment/{appointment_id}")
	 public Appointments SingleData(@PathVariable int appointment_id) {
	  return service.SingleAppointmentData(appointment_id);
	 }
		
	 @GetMapping("/alldata-appointment")
	 public List<Object> AllData() {
	  return service.AllRecordAppointment();
	 }
	}


