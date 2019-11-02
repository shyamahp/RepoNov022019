package com.employee.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empClient")
public class EmployeeClientController {

	@Autowired
	EmployeeServiceProxy empProxy;	
	
	@Autowired
	Environment environment;

	@GetMapping("/fetchEmpByClient")
	public Employee fetchEmpByClient(){
		Employee emp = empProxy.getTestEmployee();
		System.out.println(environment.getProperty("local.server.port"));
		return emp;
	}
}
