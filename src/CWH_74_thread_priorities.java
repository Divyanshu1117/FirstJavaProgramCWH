class My_Thread extends Thread {
    public My_Thread(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i <= 4) {
            System.out.println("Thank you " + this.getName());
            i++;
        }
    }
}

public class CWH_74_thread_priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
//        My_Thread t1 = new My_Thread("Divyanshu 1");
//        My_Thread t2 = new My_Thread("Divyanshu 2");
//        My_Thread t3 = new My_Thread("Divyanshu 3");
        My_Thread t4 = new My_Thread("Divyanshu 4");
        My_Thread t5 = new My_Thread("Divyanshu 5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
        t4.start();
        t5.start();
    }
}