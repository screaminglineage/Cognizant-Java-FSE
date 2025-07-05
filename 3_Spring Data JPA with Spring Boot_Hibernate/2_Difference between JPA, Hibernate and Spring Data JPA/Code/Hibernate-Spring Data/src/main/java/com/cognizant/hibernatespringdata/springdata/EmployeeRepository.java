package com.cognizant.hibernatespringdata.springdata;

import com.cognizant.hibernatespringdata.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
