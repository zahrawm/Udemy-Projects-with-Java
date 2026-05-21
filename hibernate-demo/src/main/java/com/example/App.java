package com.example;

import com.example.model.Student;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // ← Put YOUR correct ID number here!
        Student s = session.get(Student.class, 1);

        if(s != null) {
            session.remove(s);
            System.out.println("✅ " + s.getName() + " deleted successfully!");
        } else {
            System.out.println("❌ Student not found! Check the ID!");
        }

        tx.commit();
        session.close();
        HibernateUtil.shutdown();
    }
}