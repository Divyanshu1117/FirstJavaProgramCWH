class Animal {
    String name;

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class CWH_45_inheritance_1_quiz {
    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.name = "Tommy";

        System.out.println(myDog.name);
        myDog.eat();
        myDog.bark();
    }
}