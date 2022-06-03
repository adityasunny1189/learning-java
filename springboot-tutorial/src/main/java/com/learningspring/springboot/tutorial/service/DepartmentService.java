package com.learningspring.springboot.tutorial.service;

import com.learningspring.springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
  public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

  public Department fetchDepartment(Long departmentId);

  public void deleteDepartmentById(Long departmentId);

  public Department updateDepartmentById(Long departmentId, Department department);
}
