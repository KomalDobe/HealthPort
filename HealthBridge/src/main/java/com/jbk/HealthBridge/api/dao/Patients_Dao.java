package com.jbk.HealthBridge.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.HealthBridge.api.entity.Patients;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class Patients_Dao {
	
	@Autowired
	SessionFactory sessionfactory;
	public String InsertData(Patients patients) {
		
	Session session=null;
	Transaction transaction=null;
	String msg=null;
	try {
		session=sessionfactory.openSession();
		transaction=session.beginTransaction();
		session.save(patients);
		transaction.commit();
	}
	catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(session!=null) {
			session.close();
		}
	}
	return "data inserted successfully";
	}
	
	public String DeletePatientData(int patient_id) {
		  Session session=null;
		  Transaction transaction=null;
		  String msg=null;
		  try {
		   session=sessionfactory.openSession();
		   transaction=session.beginTransaction();
		   Patients patient=session.get(Patients.class,patient_id);
		   session.remove(patient);
		   transaction.commit();
		  }catch(Exception e) {
		   e.printStackTrace();
		  }finally {
		   if(session!=null) {
		    session.close();
		   }
		  }return "data deleted successfully";
		 }
			
		 public String UpdatPatient(Patients patient) {
		  Session session=null;
		  Transaction transaction=null;
		  String message=null;
		  try {
		   session=sessionfactory.openSession();
		      transaction =session.beginTransaction();
		  session.merge(patient);
		  transaction.commit();
		  }
		  catch(Exception e) {
		   e.printStackTrace();
		  }finally {
		   if(session!=null) {
		    session.close();
		   }
		  }
		  
		  return "data updated successfully";
		 }
			
		 public Patients GetSinglePatientData(int patient_id) {
		  Session session=null;
		  Transaction transaction=null;
		  Patients patient=null;
		  try {
		   session=sessionfactory.openSession();
		  transaction=session.beginTransaction();
		  patient=session.get(Patients.class,patient_id);
		  transaction.commit();
		  }catch(Exception e) {
		   e.printStackTrace();
		  }finally {
		   if(session!=null) {
		    session.close();
		   }
		  }
		  
		  return patient;
		 }
			
		 public List<Object> FetchAllPatientData() {
		  Session session=sessionfactory.openSession();
		  Transaction transaction=session.beginTransaction();
		  CriteriaBuilder cb=session.getCriteriaBuilder();
		  CriteriaQuery<Object> cq=cb.createQuery();
		  Root<Patients> root=cq.from(Patients.class);
		  cq.select(root);
		  Query<Object> query=session.createQuery(cq);
		  List<Object> list=query.getResultList();
		  return list;
		  
		 }

	
	
	
	
	

}
