package com.cognizant.hibernatespringdata.hibernate;

import com.cognizant.hibernatespringdata.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        EmployeeHibernate e = new EmployeeHibernate(factory);

        Employee emp = new Employee();
        emp.setName("Bob");
        emp.setSalary(70000);
        e.addEmployee(emp);

        factory.close();
    }
}
