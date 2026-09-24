package CWH_77_exercise5_solution;

public class Square extends Shape {

    Square(int side) {
        super(side, -1);
    }

    public int area() {
        return this.dim1 * this.dim1;
    }
}