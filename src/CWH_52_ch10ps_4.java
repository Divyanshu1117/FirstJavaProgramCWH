class Rectangle3 {

    private int length;
    private int width;

    Rectangle3(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getters:-
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Setters:-
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Area of Rectangle:-
    public int area() {
        return length * width;
    }
}

class Cuboid1 extends Rectangle3 {

    private int height;

    Cuboid1(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    // Getter:-
    public int getHeight() {
        return height;
    }

    // Setter:-
    public void setHeight(int height) {
        this.height = height;
    }

    // Volume of Cuboid:-
    public int volume() {
        return getLength() * getWidth() * height;
    }
}

public class CWH_52_ch10ps_4 {

    public static void main(String[] args) {

        Rectangle3 rectangle = new Rectangle3(10, 5);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area of Rectangle: " + rectangle.area());

        Cuboid1 cuboid = new Cuboid1(10, 5, 8);

        System.out.println("Length: " + cuboid.getLength());
        System.out.println("Width: " + cuboid.getWidth());
        System.out.println("Height: " + cuboid.getHeight());
        System.out.println("Volume of Cuboid: " + cuboid.volume());
    }
}