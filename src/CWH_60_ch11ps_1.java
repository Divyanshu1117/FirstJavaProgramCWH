abstract class Pen_0 {
    abstract void write();

    abstract void refill();
}

class FountainPen_0 extends Pen_0 {
    void write() {
        System.out.println("Write...");
    }

    void refill() {
        System.out.println("Refill...");
    }
}

public class CWH_60_ch11ps_1 {
    public static void main(String[] args) {
        FountainPen_0 pen_0 = new FountainPen_0();
        pen_0.write();
    }
}