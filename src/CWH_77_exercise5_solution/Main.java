package CWH_77_exercise5_solution;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.area());

        Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + r.area());

        Square s = new Square(5);
        System.out.println("Square Area: " + s.area());

        Cylinder cy = new Cylinder(5, 10);
        System.out.println("Cylinder Area: " + cy.area());
        System.out.println("Cylinder Volume: " + cy.volume());

        Sphere sp = new Sphere(5);
        System.out.println("Sphere Area: " + sp.area());
        System.out.println("Sphere Volume: " + sp.volume());
    }
}