class Circle4 {

    public int radius;

    Circle4(int r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder4 extends Circle3 {

    public int height;

    Cylinder4(int r, int h) {
        super(r);
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class CWH_52_ch10ps_3 {

    public static void main(String[] args) {

        Cylinder4 obj = new Cylinder4(12, 4);

        System.out.println("Area of Circle: " + obj.area());
        System.out.println("Volume of Cylinder: " + obj.volume());
    }
}