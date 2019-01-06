package com.cbc.service.impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbc.service.entities.Employee;
import com.cbc.service.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl {
	
	//@Autowired EmployeeRepo emprep;

	public Session getJobSession() {
		SessionFactory sesfac = new Configuration().configure().buildSessionFactory();
		Session ses = sesfac.openSession();

		return ses;
	}

	Session session = getJobSession();

	public List<Employee> runJobQuery() {

		Query query = session.createQuery(" from Employee");

		List<Employee> list = query.list();
		return list;
	}

	public List<Employee> runPOSTquery(String id) {
		Query query = session.createQuery(" from Employee where employeeId = '"+id+"'");
		List<Employee> list = query.list();
		return list;

	}
	
	public List<Employee> updateQuery(Employee employee) {
		session.beginTransaction();
		session.save(employee);
		List<Employee> list = runJobQuery();
		
		
		session.getTransaction().commit();
		return list;
	
	
	}
	
	public List<Employee> deletePOSTquery(String id) {
		session.beginTransaction();
		session.delete(id);
		List<Employee> list = runJobQuery();
		
		session.getTransaction().commit();
		return list;

	}
	
}
