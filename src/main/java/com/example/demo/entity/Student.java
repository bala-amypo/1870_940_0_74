package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")  // Explicitly map; adjust nullable/length as needed
    private String name;

    @Column(name = "email")
    private String email;

    // Constructors
    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // If you plan to add dob and cgpa later:
    // private LocalDate dob;
    // private Float cgpa;

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}