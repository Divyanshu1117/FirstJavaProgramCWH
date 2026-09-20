class Circle3 {

    public int radius;

    Circle3() {
        System.out.println("I am non parameterized Circle");
    }

    Circle3(int r) {
        System.out.println("I am Circle parameterized constructor:-");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder3 extends Circle3 {
    public int height;

    Cylinder3(int r, int h) {
        super(r);
        System.out.println("I am Cylinder3 parameterized constructor:-");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class CWH_52_ch10ps_1 {
    public static void main(String[] args) {

//        Circle3 objC = new Circle3(12);
        Cylinder3 obj = new Cylinder3(12, 4);
    }
}