package com.klu.JFSD_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLInsert {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        
        Student student = new Student();
        student.setDep_id(101);
        student.setName("John Doe");
        student.setHod_sal(2000.0);

        s.save(student);

        System.out.println("Record inserted successfully.");

        t.commit();
        s.close();
        sf.close();
    }
}