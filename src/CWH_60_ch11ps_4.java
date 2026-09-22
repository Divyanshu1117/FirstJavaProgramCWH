abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnected();
}

class SmartTelephone extends Telephone {
    void ring() {
        System.out.println("Telephone is ringing...");
    }

    void lift() {
        System.out.println("Telephone is lifted...");
    }

    void disconnected() {
        System.out.println("Telephone is disconnected...");
    }
}

public class CWH_60_ch11ps_4 {
    public static void main(String[] args) {
        Telephone phone = new SmartTelephone();
        phone.ring();
        phone.lift();
        phone.disconnected();
    }
}