package com.example.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "students")

// ✅ L2 Cache
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    // ✅ Default constructor
    public Student() {}

    // ✅ Constructor with fields
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // ✅ Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // ✅ Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}