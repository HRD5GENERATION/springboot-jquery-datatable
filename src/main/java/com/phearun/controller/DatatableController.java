package com.phearun.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phearun.datatable.DataTableFilter;
import com.phearun.datatable.DataTableResponse;
import com.phearun.entity.Employee;
import com.phearun.service.EmployeeService;

@Controller
public class DatatableController {

	@RequestMapping("/datatable")
	public String home() {
		return "basic/datatable";
	}

	@RequestMapping("/server/datatable")
	public String server() {
		return "server/datatable";
	}

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/ajax/datatable", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public DataTableResponse jsonServer(@RequestParam Map<String, Object> map) {
		
		DataTableFilter filter = new DataTableFilter(map);	
		
		List<Employee> employees = employeeService.findAll(filter);
		return new DataTableResponse(filter.getDraw(), filter.getTotalCount(), filter.getFilterCount(), employees);
	}
	
}
