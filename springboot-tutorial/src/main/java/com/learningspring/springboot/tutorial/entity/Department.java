package com.learningspring.springboot.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long departmentID;
  private String departmentName;
  private String departmentCode;
  private String departmentAddress;

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }

  public String getDepartmentAddress() {
    return departmentAddress;
  }

  public void setDepartmentAddress(String departmentAddress) {
    this.departmentAddress = departmentAddress;
  }

  public Long getDepartmentID() {
    return departmentID;
  }

  public void setDepartmentID(Long departmentID) {
    this.departmentID = departmentID;
  }

  public Department(Long departmentID, String departmentName, String departmentCode, String departmentAddress) {
    this.departmentID = departmentID;
    this.departmentName = departmentName;
    this.departmentCode = departmentCode;
    this.departmentAddress = departmentAddress;
  }

  public Department() {
  }

  @Override
  public String toString() {
    return "Department{" +
        "departmentID=" + departmentID +
        ", departmentName='" + departmentName + '\'' +
        ", departmentCode='" + departmentCode + '\'' +
        ", departmentAddress='" + departmentAddress + '\'' +
        '}';
  }
}
