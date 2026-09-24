class GoodM extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning!...");
        }
    }
}

class Welcome extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome!...");
        }
    }
}

public class CWH_76_ps13_1 {
    public static void main(String[] args) {
        GoodM good = new GoodM();
        Welcome welcome = new Welcome();
        good.start();
        welcome.start();
    }
}