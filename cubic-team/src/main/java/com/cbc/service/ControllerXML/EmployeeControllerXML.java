package com.cbc.service.ControllerXML;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cbc.service.entities.Employee;
import com.cbc.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/myinfo")
public class EmployeeControllerXML {

	
	@RequestMapping(value="/getemployee.xml", method = RequestMethod.GET, produces= MediaType.APPLICATION_XML_VALUE)
	// @XmlElement(name="Employee")
	public List<Employee> getEmployeeAsXML() {
		
		EmployeeServiceImpl empImpl = new EmployeeServiceImpl();
		List<Employee> emp = empImpl.runJobQuery();
	
		return emp;
	}
}
