package com.cognizant.hibernatespringdata.springdata;

import com.cognizant.hibernatespringdata.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Transactional
    public void save(Employee employee) {
        repository.save(employee);
    }
}
