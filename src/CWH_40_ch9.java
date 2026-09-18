class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

//        Circle:-

class Circle1 {
    private int radius;

    // Setter
    public void setRadius(int r) {
        radius = r;
    }

    // Getter
    public int getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CWH_40_ch9 {
    public static void main(String[] args) {
        MyEmployee divyanshu = new MyEmployee();
//        divyanshu.id = 45;
//        divyanshu.name = "Divyanshu Vashishth"; --> Throws an error due to private access modifier:-

//        divyanshu.setName("Divyanshu Vashishth");
//        System.out.println(divyanshu.getName());
//
//        divyanshu.setId(250);
//        System.out.println(divyanshu.getId());

//        Circle:-
        Circle1 c = new Circle1();
//        c.radius = 3;       // We cannot access radius directly.
        c.setRadius(3);
        System.out.println("Radius = " + c.getRadius());
        System.out.println("Area = " + c.area());
        System.out.println("Perimeter = " + c.perimeter());
    }
}