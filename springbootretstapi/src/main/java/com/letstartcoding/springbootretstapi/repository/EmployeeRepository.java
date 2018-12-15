package com.letstartcoding.springbootretstapi.repository;


	
	

import com.letstartcoding.springbootretstapi.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
}