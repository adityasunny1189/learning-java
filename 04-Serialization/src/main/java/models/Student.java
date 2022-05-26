package models;

public class Student {
    private String name;
    private String branch;
    private int rollno;
    private int year;
    private double cgpa;

    public Student(String name, String branch, int roll, int year, double cgpa) {
        this.name = name;
        this.branch = branch;
        this.rollno = roll;
        this.year = year;
        this.cgpa = cgpa;
    }

    public String getName() {
        return this.name;
    }

    public int getRollno() {
        return this.rollno;
    }
}
