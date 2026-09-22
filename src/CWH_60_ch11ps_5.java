class Monkey_0 {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

interface BasicAnimal_0 {
    void eat();

    void sleep();
}

class Human_0 extends Monkey_0 implements BasicAnimal_0 {
    void speak() {
        System.out.println("Hello Sir...");
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class CWH_60_ch11ps_5 {
    public static void main(String[] args) {
        Monkey_0 m1 = new Human_0();
        m1.jump();
        m1.bite();
//        m1.speak(); // Cannot use speak method because the reference is monkey which does not have speak method:-

        BasicAnimal_0 cold = new Human_0();
//        cold.speak(); // Error:-
        cold.eat();
        cold.sleep();
    }
}