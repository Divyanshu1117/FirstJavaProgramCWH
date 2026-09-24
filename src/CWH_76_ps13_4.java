class Good_Morning_ extends Thread {
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

class Welcome_Bro_ extends Thread {
    public void run() {
//        while (true) {
//            try {
//                Thread.sleep(200);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Welcome!...");
//        }
    }
}

public class CWH_76_ps13_4 {
    public static void main(String[] args) {
        Good_Morning_ good = new Good_Morning_();
        Welcome_Bro_ welcome = new Welcome_Bro_();
        good.setPriority(6);
        welcome.setPriority(9);
        System.out.println(good.getPriority());
        System.out.println(welcome.getPriority());
        System.out.println(welcome.getState());
//        good.start();
        welcome.start();
        System.out.println(welcome.getState());
    }
}