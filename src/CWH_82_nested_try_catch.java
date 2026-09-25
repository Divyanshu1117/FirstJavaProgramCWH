import java.util.Scanner;

public class CWH_82_nested_try_catch {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 45;
        marks[2] = 55;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index:- ");
        int ind = sc.nextInt();
        try {
            System.out.println("Welcome to my No 1 Home...");
            try {
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist!...");
                System.out.println("Exception in Level 2:-");
            }
        } catch (Exception e) {
            System.out.println("Exception in Level 2:-");
        }
    }
}