package com.phearun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phearun.entity.Employee;
import com.phearun.entity.EmployeeFilter;
import com.phearun.repository.EmployeeRepository;
import com.phearun.utility.Paging;

@Service
public class EmployeeService{

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> findAll(EmployeeFilter filter, Paging paging) {
		paging.setRecordsTotal(employeeRepository.countAll());
		paging.setRecordsFiltered(employeeRepository.countFilter(filter));
		return employeeRepository.findAll(filter, paging);
	}	
}
