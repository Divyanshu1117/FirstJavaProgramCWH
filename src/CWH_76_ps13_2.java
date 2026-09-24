class GoodMorning extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning!...");
        }
    }
}

class WelcomeBro extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome!...");
        }
    }
}

public class CWH_76_ps13_2 {
    public static void main(String[] args) {
        GoodMorning good = new GoodMorning();
        WelcomeBro welcome = new WelcomeBro();
        good.start();
        welcome.start();
    }
}