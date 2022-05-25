import java.util.Arrays;

import models.student;

class HelloWorld {

    public static int Add(int x, int y) {
        return x + y;
    }

    public static int factorial(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * factorial(x-1);
    }

    public static void sortArray(int[] myArray) {
        Arrays.sort(myArray);
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "Aditya Pathak";
        System.out.println(name);
        System.out.println(Add(2,4));

        int fact5 = factorial(5);
        System.out.println(fact5);

        int[] myNums = new int[5];

        for (int i = 0; i < 5; i++) {
            myNums[i] = 5-i;
        }
        for (int i = 0; i < myNums.length; i++) {
            System.out.println(myNums[i]);
        }
        
        // Arrays.sort(myNums);
        sortArray(myNums);
        for (int i : myNums) {
            System.out.println(i);
        }

        // Using user

        student aditya = new student();
        aditya.Setter("Aditya Pathak", "Information Science", 22, 7.89);

        String adityaInfo = aditya.Getter();
        System.out.println(adityaInfo);

    }
}