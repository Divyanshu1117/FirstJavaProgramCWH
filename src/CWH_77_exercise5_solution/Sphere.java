package CWH_77_exercise5_solution;

public class Sphere extends Shape {

    Sphere(int radius) {
        super(radius, -1);
    }

    public double area() {
        return 4 * Math.PI * this.dim1 * this.dim1;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * this.dim1 * this.dim1 * this.dim1;
    }
}