package com.audilyticssolution.employeeservice.service;

import com.audilyticssolution.employeeservice.model.Employee;
import com.audilyticssolution.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public Employee add(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    public Employee findById(Long id) {
        return empRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Employee> findByDepartment(Long departmentId) {
        return empRepo.findByDepartmentId(departmentId);
    }

    @Override
    public List<Employee> findAll() {
        return empRepo.findAll();
    }
}
