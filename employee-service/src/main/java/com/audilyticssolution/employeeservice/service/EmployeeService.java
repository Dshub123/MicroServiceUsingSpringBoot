package com.audilyticssolution.employeeservice.service;

import com.audilyticssolution.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee add(Employee emp);

    public Employee findById(Long id);

    public List<Employee> findByDepartment(Long departmentId);

    public List<Employee> findAll();
}
