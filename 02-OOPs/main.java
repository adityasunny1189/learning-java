// import models.Calculator;
import models.car;

class Main {
    public static void main(String[] args) {
        // Calculator calc = new Calculator(4.2, 2.1);

        // double add = calc.Add();
        // double subs = calc.Substract();
        // double mul = calc.Multiply();
        // double div = calc.Divide();

        // System.out.println(add + " " + subs + " " + mul + " " + div);

        car c1 = new car("thar", 4, "Mahindra", "Aditya Pathak", "Thar v2");

        System.out.println(c1.about());

        car c2 = new car("alto", 4, "maruti", "Aditya", "k 10");

        System.out.println(c2.about());
    }
}