package com.phearun.repository.provider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import com.phearun.entity.EmployeeFilter;
import com.phearun.utility.Paging;

public class EmployeeProvider {

	public String findAll(@Param("filter") EmployeeFilter filter, @Param("paging") Paging paging) {
		return new SQL() {
			{
				SELECT("firstname, lastname, position, office, start_date AS date, salary");
				FROM("employees");
				if (filter.getFirstname() != null)
					WHERE("firstname ILIKE '%' || #{filter.firstname} || '%'");

				ORDER_BY("id ASC LIMIT #{paging.limit} OFFSET #{paging.offset}");
			}
		}.toString();
	}
	
	public String countFilter(EmployeeFilter filter) {
		return new SQL() {
			{
				SELECT("COUNT(*)");
				FROM("employees");
				if (filter.getFirstname() != null)
					WHERE("firstname ILIKE '%' || #{firstname} || '%'");
			}
		}.toString();
	}
	
	public String findEmployees(@Param("filter") EmployeeFilter filter, @Param("paging") Paging paging) {
		return new SQL() {
			{
				SELECT("firstname, lastname, position, office, start_date AS date, salary, (select count(*) from employees) AS records_total, (select count(*) from employees) AS records_filtered");
				FROM("employees");
				if (filter.getFirstname() != null)
					WHERE("firstname ILIKE '%' || #{filter.firstname} || '%'");

				ORDER_BY("id ASC LIMIT #{paging.limit} OFFSET #{paging.offset}");
			}
		}.toString();
		/*StringBuffer sql = new StringBuffer();
		sql.append("SELECT COUNT(*) AS \"recordsTotal\", ");
			sql.append("( SELECT COUNT(*) FROM employees ");
			if(filter.getFirstname()!=null)
				sql.append("WHERE firstname ILIKE '%' || #{filter.firstname} || '%' ");
			sql.append(") AS \"recordsFiltered\" FROM employees");
			System.out.println(sql.toString());
		return sql.toString();*/
	}
	
	
	
	
	
	
	
	
}
