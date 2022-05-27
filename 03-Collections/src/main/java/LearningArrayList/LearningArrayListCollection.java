package LearningArrayList;

import java.util.ArrayList;

public class LearningArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aditya");
        names.add("Amit");
        names.add("Kunal");
        names.add("Adarsh");

        for (String name : names) {
            System.out.println(name);
        }

        if (names.contains("aditya")) {
            System.out.println("Hello Aditya");
        }
    }
}
