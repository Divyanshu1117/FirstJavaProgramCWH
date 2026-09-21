abstract class Parent1 {
    public Parent1() {
        System.out.println("I am Parent1 Constructor");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet(); // Abstract Method:-

    abstract public void greet1();
}

class Child2 extends Parent1 {
    @Override
    public void greet() {
        System.out.println("Good Morning...");
    }

    @Override
    public void greet1() {
        System.out.println("Good Afternoon...");
    }
}

abstract class Child3 extends Parent1 {
    public void th() {
        System.out.println("I am Good");
    }
}

public class CWH_53_abstract {
    public static void main(String[] args) {
//        Parent1 p = new Parent1(); // Error:-
        Child2 c = new Child2();
//        Child3 c3 = new Child3(); // Error:-
    }
}