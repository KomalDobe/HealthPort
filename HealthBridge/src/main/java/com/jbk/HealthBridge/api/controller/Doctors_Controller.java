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

import com.jbk.HealthBridge.api.entity.Doctors;
import com.jbk.HealthBridge.api.service.Doctors_Service;

@RestController
@RequestMapping("/doctor")
public class Doctors_Controller {
		@Autowired
		Doctors_Service service;
		
		@PostMapping("/insertdata-doctor")
		public String AddDoctorData(@RequestBody Doctors doctor) {
			return service.AddDoctor(doctor);
			
		}
		
		@DeleteMapping("/deletedata-doctor/{doctor_id}")
		 public String DeleteDoctorData(@PathVariable int doctor_id) {
		  return service.DeleteDoctorData(doctor_id);
		 }
			
		 @PutMapping("/updatedata-doctor")
		 public String UpdateDoctorInfo(@RequestBody Doctors doctor) {
		  return service.UpdateDoctorData(doctor);
		 }
			
		 @GetMapping("/singledata-doctor/{doctor_id}")
		 public Doctors SingleData(@PathVariable int doctor_id) {
		  return service.SingleDoctorData(doctor_id);
		 }
			
		 @GetMapping("/alldata-doctor")
		 public List<Object> AllData() {
		  return service.AllDoctorRecord();
		 }
		}

		

