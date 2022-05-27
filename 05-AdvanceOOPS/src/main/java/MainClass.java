public class MainClass {
    public static void main(String[] args) {
        Transformer adi = new Transformer();

        adi.setIq(10);
        adi.setLegs(2);

        adi.speed();
        adi.fire();
        adi.move();
        adi.accelerate();
    }
}
