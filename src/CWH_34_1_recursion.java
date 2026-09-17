public class CWH_34_1_recursion {

//      Fibonacci Series:
//      fibonacci(0) = 0
//      fibonacci(1) = 1
//      fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
//
//      Fibonacci Series:
//      0 1 1 2 3 5 8 13 21 34 ...
//
//      fibonacci(5) = fibonacci(4) + fibonacci(3)
//                   = 3 + 2
//                   = 5

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static void fibonacci_iterative(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        int x = 10;

        System.out.println("The Fibonacci series using recursion is:");

        for (int i = 0; i < x; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();

        System.out.println("The Fibonacci series using iteration is:");

        fibonacci_iterative(x);
    }
}