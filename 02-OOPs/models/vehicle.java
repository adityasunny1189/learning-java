package models;

public class vehicle {
    private String name;
    private int noOfWeels;
    private String company;
    final String owner;

    public vehicle(String name, int num, String company, String owner) {
        this.name = name;
        this.noOfWeels = num;
        this.company = company;
        this.owner = owner;
    } 

    public String about() {
        return this.name + " has " + this.noOfWeels + " wheels and is of company " + this.company + " and owner is " + this.owner;
    }
}
