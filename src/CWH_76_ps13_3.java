class Good_Morning extends Thread {
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

class Welcome_Bro extends Thread {
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

public class CWH_76_ps13_3 {
    public static void main(String[] args) {
        Good_Morning good = new Good_Morning();
        Welcome_Bro welcome = new Welcome_Bro();
        good.setPriority(6);
        welcome.setPriority(9);
        System.out.println(good.getPriority());
        System.out.println(welcome.getPriority());
//        good.start();
//        welcome.start();
    }
}