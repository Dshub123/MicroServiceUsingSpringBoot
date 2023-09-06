package com.audilyticssolution.employeeservice.controller;

import com.audilyticssolution.employeeservice.model.Employee;
import com.audilyticssolution.employeeservice.repository.EmployeeRepository;
import com.audilyticssolution.employeeservice.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService empService;

    @PostMapping
    public Employee addNewEmployee(@RequestBody Employee emp){
        LOGGER.info("Employee add:{}",emp);
        return empService.add(emp);
    }

    @GetMapping("emp/{empId}")
    public Employee getById(@PathVariable Long empId){
        LOGGER.info("Employee find: empId={}",empId);
        return empService.findById(empId);
    }

    @GetMapping("dept/{deptId}")
    public List<Employee> getByDeptId(@PathVariable Long deptId){
        LOGGER.info("Employee find: deptId={}",deptId);
        return empService.findByDepartment(deptId);
    }

    @GetMapping
    public List<Employee> getAll(){
        LOGGER.info("Employee find");
        return empService.findAll();
    }
}
