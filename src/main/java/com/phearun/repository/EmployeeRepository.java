package com.phearun.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import com.phearun.entity.Employee;
import com.phearun.entity.EmployeeFilter;
import com.phearun.repository.provider.EmployeeProvider;
import com.phearun.utility.Paging;

@Repository
public interface EmployeeRepository {

	@SelectProvider(type = EmployeeProvider.class, method = "findAll")
	List<Employee> findAll(@Param("filter") EmployeeFilter filter, @Param("paging") Paging paging);
	
	@Select("SELECT COUNT(*) FROM employees")
	Integer countAll();
	
	@SelectProvider(type = EmployeeProvider.class, method = "countFilter")
	Integer countFilter(EmployeeFilter filter);

}
