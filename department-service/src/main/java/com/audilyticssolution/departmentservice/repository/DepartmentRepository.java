package com.audilyticssolution.departmentservice.repository;

import com.audilyticssolution.departmentservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public interface DepartmentRepository extends JpaRepository<Department,Long> {



}
