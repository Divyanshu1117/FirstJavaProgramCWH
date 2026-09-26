import java.util.Scanner;

// Custom Exception class:-
class MaxRetriesException extends Exception {
    @Override
    public String toString() {
        return "MaxRetriesException: Maximum retry attempts reached!";
    }

    @Override
    public String getMessage() {
        return "Maximum retry attempts reached!";
    }
}

public class CWH_86_ps14_5 {

    public static void accessArray() throws MaxRetriesException {
        int[] marks = {1, 56, 6};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        while (i < 5) {
            try {
                System.out.print("Enter the value of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);
                return;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        throw new MaxRetriesException();
    }

    public static void main(String[] args) {
        try {
            accessArray();
        } catch (MaxRetriesException e) {
            System.out.println("Custom Exception Caught in main: " + e.getMessage());
        }
    }
}