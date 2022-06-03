package com.learningspring.springboot.tutorial.controller;

import com.learningspring.springboot.tutorial.entity.Department;
import com.learningspring.springboot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @PostMapping("/departments")
  public Department saveDepartment(@RequestBody Department department) {
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/departments")
  public List<Department> fetchDepartmentList() {
    return departmentService.fetchDepartmentList();
  }

  @GetMapping("/department/{id}")
  public Department fetchDepartment(@PathVariable("id") Long departmentId) {
    return departmentService.fetchDepartment(departmentId);
  }

  @DeleteMapping("/departments/{id}")
  public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
    departmentService.deleteDepartmentById(departmentId);
    return "department deleted successfully";
  }

  @PutMapping("/departments/{id}")
  public Department updateDepartmentById(@PathVariable("id") Long departmentId,
                                         @RequestBody Department department) {
    return departmentService.updateDepartmentById(departmentId, department);
  }
}
