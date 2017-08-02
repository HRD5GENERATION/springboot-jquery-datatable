package com.phearun.repository.provider;

import org.apache.ibatis.jdbc.SQL;

import com.phearun.datatable.DataTableFilter;

public class EmployeeProvider {

	public String findAll(DataTableFilter filter){
		return new SQL(){{
			SELECT("firstname, lastname, position, office, start_date AS date, salary");
			FROM("employees");
			if(filter.getSearch()!=null)
				WHERE("firstname ILIKE '%' || #{search} || '%'");
			ORDER_BY("firstname ASC LIMIT #{length} OFFSET #{start}");
		}}.toString();
	}
	
	public String countFilter(DataTableFilter filter){
		return new SQL(){{
			SELECT("COUNT(*)");
			FROM("employees");
			if(filter.getSearch()!=null)
				WHERE("firstname ILIKE '%' || #{search} || '%'");
		}}.toString();
	}
}
