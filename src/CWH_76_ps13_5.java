class _Good_Morning_ extends Thread {
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

class _Welcome_Bro_ extends Thread {
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

public class CWH_76_ps13_5 {
    public static void main(String[] args) {
        _Good_Morning_ good = new _Good_Morning_();
        _Welcome_Bro_ welcome = new _Welcome_Bro_();
        good.setPriority(6);
        welcome.setPriority(9);
        System.out.println(good.getPriority());
        System.out.println(welcome.getPriority());
        System.out.println(welcome.getState());
//        good.start();
        welcome.start();
        System.out.println(welcome.getState());
        System.out.println(Thread.currentThread().getState());
    }
}