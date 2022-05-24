package models;

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
        boolean ispass = this.isPlaced();
        return "Name of student is: " + this.name + " Branch: " + this.branch + " Age: " + String.valueOf(this.age) + " CGPA: " + String.valueOf(this.cgpa) + " Has Passed the exam: " + String.valueOf(ispass);
    }

    private boolean isPlaced() {
        if (this.cgpa > 7.0) {
            return true;
        }
        return false;
    }
}
