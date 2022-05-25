package models;

import services.ispass_service;

public class student {
    String name, branch;
    int age;
    double cgpa;

    public void Setter(String name, String branch, int age, double cgpa) {
        this.name = name;
        this.branch = branch;
        this.age = age;
        this.cgpa = cgpa;
    }

    public String Getter() {
        boolean ispass = ispass_service.isPass(this.cgpa);
        return "Name of student is: " + this.name + " Branch: " + this.branch + " Age: " + String.valueOf(this.age) + " CGPA: " + String.valueOf(this.cgpa) + " Has Passed the exam: " + String.valueOf(ispass);
    }
}
