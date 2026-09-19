class Cylinder {
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
}

public class CWH_44_ps09_Q1 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
//        int h = myCylinder.getHeight();
//        System.out.println(h);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
    }
}