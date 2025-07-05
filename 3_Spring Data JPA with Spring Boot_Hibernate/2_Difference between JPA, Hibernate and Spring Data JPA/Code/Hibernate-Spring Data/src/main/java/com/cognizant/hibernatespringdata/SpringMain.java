package com.cognizant.hibernatespringdata;

import com.cognizant.hibernatespringdata.entity.Employee;
import com.cognizant.hibernatespringdata.springdata.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication()
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringMain.class, args);
        EmployeeService service = context.getBean(EmployeeService.class);
        Employee employee =  new Employee();
        employee.setName("John");
        employee.setSalary(42000);
        service.save(employee);
    }
}