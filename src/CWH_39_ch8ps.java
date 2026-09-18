class Employee1 {

    //        Problem 1:-
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

//        Problem 2:-
class CellPhone {
    public void ring() {
        System.out.println("Ringning...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Lovish...");
    }
}

//        Problem 3:-
class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

//        Problem 4:-
class Rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

//        Problem 5:-
class Tommy {
    public void hit() {
        System.out.println("Hitting the enemy...");
    }

    public void run() {
        System.out.println("Running from the enemy...");
    }

    public void fire() {
        System.out.println("Firing the enemy...");
    }
}

//        Problem 6:-
class Circle {
    int radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CWH_39_ch8ps {
    public static void main(String[] args) {

//        Problem 1:-
//        Employee1 cold = new Employee1();
//        cold.setName("Coldzero");
//        cold.salary = 500;
//        System.out.println(cold.getName());
//        System.out.println(cold.getSalary());

//        Problem 2:-
//        CellPhone motog31 = new CellPhone();
//        motog31.callFriend();
//        motog31.vibrate();
//        motog31.ring();

//        Problem 3:-
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

//        Problem 4:-
//        Rectangle rect = new Rectangle();
//        rect.length = 5;
//        rect.breadth = 3;
//        System.out.println(rect.area());
//        System.out.println(rect.perimeter());

//        Problem 5:-
//        Tommy player1 = new Tommy();
//        player1.fire();
//        player1.run();
//        player1.hit();

//        Problem 6:-
        Circle c = new Circle();
        c.radius = 3;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}