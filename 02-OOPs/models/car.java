package models;

public class car extends vehicle {
    private String model;

    public car(String name, int num, String company, String owner, String model) {
        super(name, num, company, owner);
        this.model = model;
    }

    public String about() {
        return super.about() + " and model no " + this.model;
    }
}
