abstract class Pen_1 {
    abstract void write();

    abstract void refill();
}

class FountainPen_1 extends Pen_1 {
    void write() {
        System.out.println("Write...");
    }

    void refill() {
        System.out.println("Refill...");
    }

    void changeNib() {
        System.out.println("Change Nib...");
    }
}

public class CWH_60_ch11ps_2 {
    public static void main(String[] args) {
        FountainPen_1 pen_1 = new FountainPen_1();
        pen_1.changeNib();
    }
}