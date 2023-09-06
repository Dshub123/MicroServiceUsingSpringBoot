package com.audilyticssolution.departmentservice.service;

import com.audilyticssolution.departmentservice.model.Department;

import java.util.List;

public interface DepartmentService {

    public Department addDepartment(Department dept);

    public Department findById(Long id);

    public List<Department> findAll();
}
