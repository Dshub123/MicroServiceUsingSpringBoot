package com.audilyticssolution.departmentservice.service;

import com.audilyticssolution.departmentservice.model.Department;
import com.audilyticssolution.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceimpl {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department addDepartment(Department dept){
        return departmentRepository.save(dept);
    }

    public Department findById(Long id){
        return departmentRepository.findById(id).orElseThrow();
    }

    public List<Department> findAll(){
        return departmentRepository.findAll();
    }
}
