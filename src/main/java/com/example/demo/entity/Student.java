package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.Validation.constraints.NotBlank;
import jakarta.Validation.constraints.Email;
import jakarta.Validation.constraints.Size;
import jakarta.persistence.olumn;
@Entity
//@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Name field connot be empty")
    @Size(min=3,max=20,message="The user must be min of 3 and max of 20 characters")
    private String name;
    @Email(message="Invalid email id")
    @column(unique=true)
    private String email;

    

    public Student() {
    }

    public Student(Long  id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

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