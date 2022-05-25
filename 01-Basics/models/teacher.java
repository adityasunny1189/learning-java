package models;

public class teacher {
    private String name;

    public teacher() {
        this.name = "Random Name";
    }

    public teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
