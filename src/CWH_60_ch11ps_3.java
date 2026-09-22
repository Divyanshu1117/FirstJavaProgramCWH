class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
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

public class CWH_60_ch11ps_3 {
    public static void main(String[] args) {
        Human divyanshu = new Human();
        divyanshu.sleep();
    }
}