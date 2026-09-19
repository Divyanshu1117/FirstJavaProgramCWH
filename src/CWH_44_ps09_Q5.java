class Sphere {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class CWH_44_ps09_Q5 {
    public static void main(String[] args) {

        Sphere mySphere = new Sphere();
        mySphere.setRadius(9);
        System.out.println(mySphere.getRadius());
    }
}