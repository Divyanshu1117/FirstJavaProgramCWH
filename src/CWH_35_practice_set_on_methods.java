public class CWH_35_practice_set_on_methods {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//     sum(n) = 1 + 2 + 3... + n
//     sum(n) = 1 + 2 + 3... + n - 1 + n
//     sum(n) = sum(n-1) + n
//     sum(3) = 3 + sum(2)
//     sum(3) = 3 + 2 + sum(1)
//     sum(3) = 3 + 2 + 1

    static int sumRec(int n) {
        // Base Condition:
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n) {
        /* if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        } */

        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static float average(int x, int... arr) {
        int sum = x;
        for (int a : arr) {
            sum += a;
        }
        int count = arr.length + 1;
        return (float) sum / count;
    }

    static void pattern2_rec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n - 1);
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

//            pattern1_rec(3)
//            pattern_rec(2) + 3 times star and new line
//            pattern_rec(1) + 2 times star and new line + 3 times start and new line
//            pattern_rec(0) + 1 times star and new line + 2 times start and new line + 3 times start and new line
        }
    }

    static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static int sum_iterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
//        Problem 1:
//        multiplication(7);

//        Problem 2:
//        pattern1(4);

//        Problem 3:
//        int c = sumRec(4);
//        System.out.println(c);

//        Problem 4:
//        pattern2(5);

//        Problem 5:
//        fibonacci series:- 0, 1, 1, 2, 3, 5, 8, 13, 21, 34:
//        int result = fib(7);
//        System.out.println(result);

//        Problem 6:
//        System.out.println("The average of 1 is: " + average(1));
//        System.out.println("The average of 4 and 5 is: " + average(4, 5));
//        System.out.println("The average of 4, 3 and 5 is: " + average(4, 3, 5));

//        Problem 7:
//        int n = 4;
//        pattern2_rec(n);

//        Problem 8:
//        pattern1_rec(4);

//        Problem 9:
//        float celsius = 25;
//        System.out.println("Temperature in Celsius: " + celsius);
//        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));

//        Problem 10:
        int n = 5;
        System.out.println("The sum of first " + n + " natural numbers is: " + sum_iterative(n));
    }
}