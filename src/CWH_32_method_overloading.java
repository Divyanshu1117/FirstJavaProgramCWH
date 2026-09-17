public class CWH_32_method_overloading {

    static void foo() {
        System.out.println("Good Morning Bro!");
    }

    static void foo(int a) {
        System.out.println("Good Morning " + a + " Bro!");
    }

    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
    }

    static void foo(int a, int b, int c) {
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
        System.out.println("Good Morning " + c + " Bro!");
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void tellJoke() {
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }

    public static void main(String[] args) {
//        tellJoke();
//        int[] marks = {52, 73, 77, 89, 94};
//        Case 1: Changing the Integer:
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: " + x);

//        Case 1: Changing the Array:
//        int[] marks = {52, 73, 77, 89, 94};
//        change2(marks);
//        System.out.println("The value of x after running change is: " + marks[0]);

//        Method Overloading:
        foo();
        foo(1000);
        foo(2000, 3000); // Arguments are actual!
        foo(4000, 5000, 6000);
    }
}