package com.learningspring.springboot.tutorial.service;

import com.learningspring.springboot.tutorial.entity.Department;
import com.learningspring.springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  @Override
  public Department saveDepartment(Department department) {
    return departmentRepository.save(department);
  }

  @Override
  public List<Department> fetchDepartmentList() {
    return departmentRepository.findAll();
  }

  @Override
  public Department fetchDepartment(Long departmentId) {
    return departmentRepository.findById(departmentId).get();
  }

  @Override
  public void deleteDepartmentById(Long departmentId) {
    departmentRepository.deleteById(departmentId);
  }

  @Override
  public Department updateDepartmentById(Long departmentId, Department department) {
    Department dept = departmentRepository.findById(departmentId).get();

    if (Objects.nonNull(department.getDepartmentName())
        && !"".equalsIgnoreCase(department.getDepartmentName())) {
      dept.setDepartmentName(department.getDepartmentName());
    }

    if (Objects.nonNull(department.getDepartmentAddress())
        && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
      dept.setDepartmentAddress(department.getDepartmentAddress());
    }

    if (Objects.nonNull(department.getDepartmentCode())
        && !"".equalsIgnoreCase(department.getDepartmentCode())) {
      dept.setDepartmentCode(department.getDepartmentCode());
    }

    return departmentRepository.save(dept);
  }
}
