package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Student;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Collection;

public class Service {
    public static String Encode(List<Student> students) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String jsonString = gson.toJson(students);
        return jsonString;
    }

    public static List<Student> Decode(String jsonString) {
        Gson gson = new Gson();
        Type studentListType = new TypeToken<Collection<Student>>() {}.getType();
        List<Student> students = gson.fromJson(jsonString, studentListType);
        return students;
    }
}
