package com.phearun.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import com.phearun.datatable.DataTableFilter;
import com.phearun.entity.Employee;
import com.phearun.repository.provider.EmployeeProvider;

@Repository
public interface EmployeeRepository {

	@SelectProvider(type = EmployeeProvider.class, method = "findAll")
	List<Employee> findAll(DataTableFilter filter);
	
	@Select("SELECT COUNT(*) FROM employees")
	Integer countAll();
	
	@SelectProvider(type = EmployeeProvider.class, method = "countFilter")
	Integer countFilter(DataTableFilter filter);
}
