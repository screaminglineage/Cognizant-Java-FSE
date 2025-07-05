package com.cognizant.hibernatespringdata.hibernate;
import com.cognizant.hibernatespringdata.entity.Employee;
import org.hibernate.*;
public class EmployeeHibernate {
    private final SessionFactory factory;

    public EmployeeHibernate(SessionFactory factory) {
        this.factory = factory;
    }

    public Integer addEmployee(Employee emp) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer id = null;
        try {
            tx = session.beginTransaction();
            id = (Integer) session.save(emp);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return id;
    }
}
