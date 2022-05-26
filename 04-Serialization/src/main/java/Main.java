import models.Student;
import services.Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Read the file
        String jsonString = "";
        Map<Integer, Boolean> filledRollnums = new HashMap();
        List<Student> students = new ArrayList<>();

        try (FileReader reader = new FileReader("students.json")) {
            int i;
            while ((i = reader.read()) != -1) {
                jsonString += (char)i;
            }
            students = Service.Decode(jsonString);
            for (Student student : students) {
                System.out.println(student.getName());
                filledRollnums.put(student.getRollno(), true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(filledRollnums);

        Scanner sc = new Scanner(System.in);

        String name, branch;
        int year, rollno;
        double cgpa;

        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter RollNo: ");
        rollno = sc.nextInt();
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();

        Student aditya = new Student(name, branch, rollno, year, cgpa);

        students.add(aditya);
        String json = Service.Encode(students);

        try (FileWriter file = new FileWriter("students.json")) {
            file.write(json);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
