class Rectangle_1 {

    //    Overload Constructor:-
    private int length;
    private int breadth;

    public Rectangle_1() {
        this.breadth = 4;
        this.length = 5;
    }

    public Rectangle_1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class CWH_44_ps09_Q4 {
    public static void main(String[] args) {
        Rectangle_1 rectangle = new Rectangle_1(12, 56);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreadth());
    }
}