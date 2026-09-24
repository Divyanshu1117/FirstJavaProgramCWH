package CWH_77_exercise5_solution;

public class Cylinder extends Shape {

    Cylinder(int radius, int height) {
        super(radius, height);
    }

    public double area() {
        return 2 * Math.PI * this.dim1 * (this.dim2 + this.dim1);
    }

    public double volume() {
        return Math.PI * this.dim1 * this.dim1 * this.dim2;
    }
}