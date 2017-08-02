package com.phearun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phearun.repository.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJqueryDatatableApplicationTests {

	@Autowired
	private EmployeeRepository repo;
	
	@Test
	public void contextLoads() {
		//repo.findAll(new DataTableFilter(new HashMap<>())).forEach(System.out::println);
		//System.out.println(repo.countAll());
		//System.out.println(repo.countFilter(new DataTableFilter(new HashMap<>())));
	}

}
