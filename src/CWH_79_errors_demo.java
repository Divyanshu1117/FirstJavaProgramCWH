import java.util.Scanner;

public class CWH_79_errors_demo {
    public static void main(String[] args) {
//        Syntax Error:-
//        int a = 0 // Error:- No Semicolon:-
//        b = 8; // Error: b Not Declared:-

//        Logical error demo:-
//        Prime Numbers 1 to 10:-
//        System.out.println(2);
//        for (int i = 1; i < 5; i++) {
//            System.out.println(2 * i + 1);
//        }

//        Runtime Error, Exception:-
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000 / k);
    }
}