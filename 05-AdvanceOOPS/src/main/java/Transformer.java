public class Transformer implements Car, Robot, Weapon{

    private int legs;
    private int iq;

    public int getIq() {
        return iq;
    }

    public int getLegs() {
        return legs;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate fast");
    }

    @Override
    public void speed() {
        System.out.println("Speed fast");
    }

    @Override
    public void fire() {
        System.out.println("Attack fire");
    }

    @Override
    public void move() {
        System.out.println("move fast");
    }
}
