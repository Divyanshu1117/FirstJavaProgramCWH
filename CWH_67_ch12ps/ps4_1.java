import ps_4.ps4_0;

class c1 extends ps4_0 {

    void show() {
        System.out.println(proInt);
        // System.out.println(defInt); // ERROR
    }
}

public class ps4_1 {

    public static void main(String[] args) {
        System.out.println("I am main method!");
        c1 c = new c1();
        c.show();
    }
}