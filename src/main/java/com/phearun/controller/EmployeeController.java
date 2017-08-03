package com.phearun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phearun.entity.Employee;
import com.phearun.entity.EmployeeFilter;
import com.phearun.service.EmployeeService;
import com.phearun.utility.Paging;
import com.phearun.utility.Response;

@Controller
public class EmployeeController {

	@RequestMapping("/employees")
	public String server() {
		return "datatable";
	}

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/api/employees")
	@ResponseBody
	public Response findAll(EmployeeFilter filter, Paging paging) {
		
		System.out.println(filter);
		System.out.println(paging);
		
		List<Employee> employees = employeeService.findAll(filter, paging);
		return new Response(employees, paging);
	}
	
	
}
