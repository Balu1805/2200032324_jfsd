package com.klu.JFSD_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDelete {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        String hql = "DELETE FROM Student WHERE dep_id = :depId";

        int result = s.createQuery(hql)
                .setParameter("depId", 101)
                .executeUpdate();

        if (result > 0) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("No record found with the given ID.");
        }

        t.commit();
        s.close();
        sf.close();
    }
}