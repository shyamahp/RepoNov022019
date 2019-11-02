package com.employee.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="employee-service")
@RibbonClient(name="employee-service")
public interface EmployeeServiceProxy {

	@GetMapping("/getTestEmployee")
	public Employee getTestEmployee();
	
}

