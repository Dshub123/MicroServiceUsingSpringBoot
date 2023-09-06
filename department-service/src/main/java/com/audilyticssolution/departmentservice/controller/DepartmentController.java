package com.audilyticssolution.departmentservice.controller;

import com.audilyticssolution.departmentservice.client.EmployeeClient;
import com.audilyticssolution.departmentservice.model.Department;
import com.audilyticssolution.departmentservice.service.DepartmentServiceimpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentServiceimpl deptService;

    @Autowired
    private EmployeeClient employeeClient;

    @PostMapping
    public Department add(@RequestBody Department dept){
        LOGGER.info("Department add: {}",dept);
        return deptService.addDepartment(dept);
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable Long id){
        LOGGER.info("Department find: id={}",id);
        return deptService.findById(id);
    }

    @GetMapping
    public List<Department> getAll(){
        LOGGER.info("Department find");
        return deptService.findAll();
    }

    @GetMapping("/with-employees")
    public List<Department> getAllWithEmployees(){
        LOGGER.info("Department find with employess");
        List<Department> departments = deptService.findAll();
        departments.forEach(dept->dept.setEmployees(employeeClient.getByDeptId(dept.getId())));
        return departments;
    }
}
