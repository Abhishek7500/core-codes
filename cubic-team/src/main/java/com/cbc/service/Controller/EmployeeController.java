package com.cbc.service.Controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cbc.service.entities.Employee;
import com.cbc.service.impl.EmployeeServiceImpl;

@Configuration
@RestController
@RequestMapping("/employeeinfo")
public class EmployeeController {
	 @Autowired EmployeeServiceImpl empImpl;

	final static Logger logger = Logger.getLogger(EmployeeController.class);
	//EmployeeServiceImpl empImpl = new EmployeeServiceImpl();

	@RequestMapping(value = "/getemployee.json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployee() {

		List<Employee> emp = empImpl.runJobQuery();
		logger.debug("HERE IS YOUR LOG MAN");
		return emp;
	}

	@RequestMapping(value = "/getpostemployee.json/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getPostEmployee(@PathVariable("id") String id) {
		List<Employee> emp = empImpl.runPOSTquery(id);
		return emp;
	}

	@RequestMapping(value = "/getnewemployee.json", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getPOSTEmployee(@RequestBody Employee employee) {

		List<Employee> emp = empImpl.updateQuery(employee);
		return emp;
	}
	
	@RequestMapping(value = "/deletepostemployee.json/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> delPostEmployee(@PathVariable("id") String id) {
		List<Employee> emp = empImpl.deletePOSTquery(id);
		return emp;
	}

}
