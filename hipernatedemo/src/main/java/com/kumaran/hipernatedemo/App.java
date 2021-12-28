package com.kumaran.hipernatedemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kumaran.jpa.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee emp=new Employee();
       emp.setId(103);
       emp.setFirstname("kaadhar");
       emp.setSecondname("ibrahim");
       emp.setSalary(25000);
       Configuration con=new Configuration().configure("hibernate.cfg.xml");
       SessionFactory factory=con.buildSessionFactory();
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       session.save(emp);
       tx.commit();
       System.out.println("hey buddy");
       session.close();
       factory.close();
       
    }
}
