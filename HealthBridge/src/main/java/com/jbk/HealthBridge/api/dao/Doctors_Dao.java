package com.jbk.HealthBridge.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.HealthBridge.api.entity.Doctors;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;



@Repository
public class Doctors_Dao {
		@Autowired
		private SessionFactory sf;
		
		public String InsertData(Doctors doctors) {
			Session session=null;
			Transaction transaction=null;
			String msg=null;
			try {
				session=sf.openSession();
				transaction=session.beginTransaction();
				session.save(doctors);
				transaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				
				
			}finally{
				if(session!=null) {
					session.close();
				}
			}
			return "Data added successfully";
		}
		
		public String DeleteDoctorData(int doctor_id) {
			  Session session=null;
			  Transaction transaction=null;
			  String msg=null;
			  try {
			   session=sf.openSession();
			   transaction=session.beginTransaction();
			   Doctors doctors=session.get(Doctors.class,doctor_id);
			   session.remove(doctors);
			   transaction.commit();
			  }catch(Exception e) {
			   e.printStackTrace();
			  }finally {
			   if(session!=null) {
			    session.close();
			   }
			  }return "data deleted successfully";
			 }
			 public String UpdateDoctor(Doctors doctors) {
			  Session session=null;
			  Transaction transaction=null;
			  String message=null;
			  try {
			   session=sf.openSession();
			      transaction =session.beginTransaction();
			  session.merge(doctors);
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
				
			 public Doctors GetSingleDoctorData(int doctor_id) {
			  Session session=null;
			  Transaction transaction=null;
			  Doctors doctors=null;
			  try {
			   session=sf.openSession();
			  transaction=session.beginTransaction();
			  doctors=session.get(Doctors.class,doctor_id);
			  transaction.commit();
			  }catch(Exception e) {
			   e.printStackTrace();
			  }finally {
			   if(session!=null) {
			    session.close();
			   }
			  }
			  
			  return doctors;
			 }
				
			 public List<Object> FetchAllDoctorData() {
			  Session session=sf.openSession();
			  Transaction transaction=session.beginTransaction();
			  CriteriaBuilder cb=session.getCriteriaBuilder();
			  CriteriaQuery<Object> cq=cb.createQuery();
			  Root<Doctors> root=cq.from(Doctors.class);
			  cq.select(root);
			  Query<Object> query=session.createQuery(cq);
			  List<Object> list=query.getResultList();
			  return list;
			  
			 }
			}


