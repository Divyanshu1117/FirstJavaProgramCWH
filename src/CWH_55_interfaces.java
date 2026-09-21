// Interface is a group of abstract methods:-
interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {
    void blowHornPeePee();

    void blowHornPooPoo();
}

class HeroCycle implements Bicycle, HornBicycle {
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo...");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Break...");
    }

    public void speedUp(int increment) {
        System.out.println("Applying Speed Up...");
    }

    public void blowHornPeePee() {
        System.out.println("Pee Pee...");
    }

    public void blowHornPooPoo() {
        System.out.println("Poo Poo...");
    }
}

public class CWH_55_interfaces {
    public static void main(String[] args) {
        HeroCycle hero = new HeroCycle();
        hero.applyBrake(1);

//        You can create properties in Interfaces:-
//        System.out.println(hero.a);

//        You cannot modify the properties in Interfaces as they are final:-
//        hero.a = 454; // Error:- Final Variable:-
//        System.out.println(hero.a);

        hero.blowHornPeePee();
        hero.blowHornPooPoo();
    }
}