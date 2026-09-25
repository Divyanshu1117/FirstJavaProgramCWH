public class CWH_80_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

//        Without Try:-
//        int c = a / b;
//        System.out.println("The result is " + c);

//        With Try:-
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (ArithmeticException e) {
            System.out.println("We failed to divide. Reason: " + e.getMessage());
        }
        System.out.println("End of the program");
    }
}