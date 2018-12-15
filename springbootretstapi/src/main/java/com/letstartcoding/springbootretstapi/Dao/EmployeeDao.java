package com.letstartcoding.springbootretstapi.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letstartcoding.springbootretstapi.model.Employee;
import com.letstartcoding.springbootretstapi.repository.EmployeeRepository;
@Service
public class EmployeeDao {
   @Autowired
   EmployeeRepository employeeRepository;
   
   /*to save a employee*/
   
   public Employee save(Employee emp) {
	   return employeeRepository.save(emp);
   }
   /* search All Employee*/
   
   public List<Employee> findAll(){
	   return employeeRepository.findAll();
   }
   /*get a employee by in Id*/
   public Employee onefind(long empId) {
	    return employeeRepository.findOne(empId);
   }
   /* delete a employee */
   public void delete( Employee empe) {
	   employeeRepository.delete(empe);
   }
}
