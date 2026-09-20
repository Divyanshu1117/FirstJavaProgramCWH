class Rectangle2 {

    int length;
    int width;

    Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Cuboid extends Rectangle2 {
    int height;

    Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
}

public class CWH_52_ch10ps_2 {
    public static void main(String[] args) {

        Rectangle2 rectangle = new Rectangle2(10, 5);

        Cuboid cuboid = new Cuboid(10, 5, 8);

        System.out.println("Rectangle Length: " + rectangle.length);
        System.out.println("Rectangle Width: " + rectangle.width);

        System.out.println("Cuboid Length: " + cuboid.length);
        System.out.println("Cuboid Width: " + cuboid.width);
        System.out.println("Cuboid Height: " + cuboid.height);
    }
}