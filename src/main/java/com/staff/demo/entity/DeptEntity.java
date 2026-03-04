package com.staff.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class DeptEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String deptName;

    @Column(nullable = false, unique = true)
    private String deptCode;

    private String location;

    // Constructors
    public DeptEntity() {}

    public DeptEntity(String deptName, String deptCode, String location) {
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.location = location;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }

    public String getDeptCode() { return deptCode; }
    public void setDeptCode(String deptCode) { this.deptCode = deptCode; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}