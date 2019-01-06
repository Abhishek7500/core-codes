package com.cbc.service.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cbc.service.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, String>{

}
