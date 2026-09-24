package ps_4;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + a + b);
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + Math.sin(a + b));
    }
}

class HyCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + a + b);
        System.out.println("Your result is: " + Math.sin(a + b));
    }
}

public class ps4_0 {
    protected int proInt = 4;
    int defInt = 41;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}