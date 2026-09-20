class Base2 {

    Base2() {
        System.out.println("I am Base2 class constructor");
    }
}

class Derived3 extends Base {
    Derived3() {
        System.out.println("I am Derived3 class constructor");
    }
}

class Derived4 extends Derived3 {
    Derived4() {
        System.out.println("I am Derived4 class constructor");
    }
}

public class CWH_52_ch10ps_5 {
    public static void main(String[] args) {
        Derived3 obj = new Derived3();
    }
}