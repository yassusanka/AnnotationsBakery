package com.zipcodewilmington.bakery.Models;

import javax.persistence.*;


@Entity
public class Baker {

    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="employeeId")
    private String employeeId;
    @Column (name="speciality")
    private String specialty;

    public Baker() {
    }

    public Baker(String name, String employeeId, String specialty) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialty = specialty;
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
