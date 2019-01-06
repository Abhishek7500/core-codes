package com.cbc.service.DAO;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import com.cbc.service.entities.Employee;

public class EmployeeDAO {
//
//	public Session getJobSession() {
//		SessionFactory sesfac = new Configuration().configure().buildSessionFactory();
//		Session ses = sesfac.openSession();
//
//		return ses;
//	}
//
//	public List<Employee> runJobQuery() {
//		Session session = getJobSession();
//		Query query = session.createQuery(" from Employee");
//
//		List<Employee> list = query.list();
//		return list;
//	}
}
