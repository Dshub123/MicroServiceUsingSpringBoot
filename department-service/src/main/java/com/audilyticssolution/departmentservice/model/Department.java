package com.audilyticssolution.departmentservice.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    @Id
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
