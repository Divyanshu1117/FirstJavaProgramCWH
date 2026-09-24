class My_Thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 4) {
            System.out.println("Thank you Bro 1");
            i++;
        }
    }
}

class My_Thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 455) {
            System.out.println("Thank you Bro 2");
            try {
                Thread.sleep(150);
            } catch (Exception e) {
                System.out.println(e);
                ;
            }
            i++;
        }
    }
}

public class CWH_75_thread_methods {
    public static void main(String[] args) {
        My_Thread1 t1 = new My_Thread1();
        My_Thread2 t2 = new My_Thread2();
        t1.start();
//        try{
//            t1.join();
//        } catch(Exception e) {
//            System.out.println(e);
//        }
        t2.start();
    }
}