package CWH_77_exercise5_solution;

public class Circle extends Shape {

    Circle(int radius) {
        super(radius, -1);
    }

    public double area() {
        return Math.PI * this.dim1 * this.dim1;
    }
}