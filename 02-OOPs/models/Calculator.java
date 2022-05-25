package models;
public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double n1, double n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public double Add() {
        return this.num1 + this.num2;
    }

    public double Substract() {
        if (this.num1 > this.num2) {
            return this.num1 - this.num2;
        }
        return this.num2 - this.num1;
    }

    public double Multiply() {
        return this.num1 * this.num2;
    }

    public double Divide() {
        return this.num1 / this.num2;
    }
}
