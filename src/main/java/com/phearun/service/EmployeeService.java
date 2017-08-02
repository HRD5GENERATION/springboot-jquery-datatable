package com.phearun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phearun.datatable.DataTableFilter;
import com.phearun.entity.Employee;
import com.phearun.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> findAll(DataTableFilter filter) {
		
		filter.setTotalCount(employeeRepository.countAll());
		filter.setFilterCount(employeeRepository.countFilter(filter));
		
		return employeeRepository.findAll(filter);
	}	
}
