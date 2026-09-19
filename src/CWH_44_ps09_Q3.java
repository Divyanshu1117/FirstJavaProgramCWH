class Cylinder_2 {
    private int radius;
    private int height;

    // Constructor:-
    public Cylinder_2(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class CWH_44_ps09_Q3 {
    public static void main(String[] args) {
        Cylinder_2 myCylinder = new Cylinder_2(12, 9);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
    }
}