class Cylinder_1 {
    private int radius;
    private int height;

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

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

public class CWH_44_ps09_Q2 {
    public static void main(String[] args) {
        Cylinder_1 myCylinder = new Cylinder_1();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
//        int h = myCylinder.getHeight();
//        System.out.println(h);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
}