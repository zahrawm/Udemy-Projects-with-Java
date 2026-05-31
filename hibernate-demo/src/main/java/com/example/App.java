package com.example;

import com.example.model.Student;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        // =============================================
        // ✅ STEP 1: Save a Student
        // =============================================
        System.out.println("=============================");
        System.out.println("       SAVING STUDENT        ");
        System.out.println("=============================");

        Session session0 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session0.beginTransaction();

        Student newStudent = new Student("Fatimah", "fatimah@email.com");
        session0.persist(newStudent);

        tx.commit();
        session0.close();

        int savedId = newStudent.getId();
        System.out.println("✅ Student saved with ID: " + savedId);


        // =============================================
        // ✅ STEP 2: L1 Cache Demo (same session)
        // =============================================
        System.out.println("\n=============================");
        System.out.println("       L1 CACHE DEMO         ");
        System.out.println("=============================");

        Session session1 = HibernateUtil.getSessionFactory().openSession();

        System.out.println("--- First call (hits DATABASE) ---");
        Student s1 = session1.get(Student.class, savedId);
        System.out.println("✅ Got: " + s1.getName() + " | " + s1.getEmail());

        System.out.println("\n--- Second call (hits L1 CACHE - NO SQL!) ---");
        Student s2 = session1.get(Student.class, savedId);
        System.out.println("✅ Got: " + s2.getName() + " | " + s2.getEmail());

        System.out.println("\n--- Are they the same object? ---");
        System.out.println(s1 == s2
                ? "✅ YES - Same object = L1 Cache working!"
                : "❌ NO - Something is wrong");

        session1.close();
        System.out.println("\n🔴 Session1 closed — L1 Cache destroyed!");


        // =============================================
        // ✅ STEP 3: L2 Cache Demo (different sessions)
        // =============================================
        System.out.println("\n=============================");
        System.out.println("       L2 CACHE DEMO         ");
        System.out.println("=============================");

        System.out.println("--- Session2: hits DATABASE, stores in L2 ---");
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Student s3 = session2.get(Student.class, savedId);
        System.out.println("✅ Got: " + s3.getName() + " | " + s3.getEmail());
        session2.close();
        System.out.println("🔴 Session2 closed!");

        System.out.println("\n--- Session3: hits L2 CACHE (NO SQL!) ---");
        Session session3 = HibernateUtil.getSessionFactory().openSession();
        Student s4 = session3.get(Student.class, savedId);
        System.out.println("✅ Got: " + s4.getName() + " | " + s4.getEmail());
        session3.close();
        System.out.println("🔴 Session3 closed!");

        HibernateUtil.shutdown();
        System.out.println("\n✅ All done!");
    }
}