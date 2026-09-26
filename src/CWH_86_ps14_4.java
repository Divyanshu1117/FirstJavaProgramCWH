import java.util.Scanner;

// Custom Exception class:-
class MaxRetriesReachedException extends Exception {
    @Override
    public String toString() {
        return "MaxRetriesReachedException: 5 retries limit exceeded!";
    }

    @Override
    public String getMessage() {
        return "5 retries limit exceeded!";
    }
}

public class CWH_86_ps14_4 {
    public static void main(String[] args) {
        int[] marks = {1, 56, 6};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        while (i < 5) {
            try {
                System.out.print("Enter the value of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }

        if (i >= 5) {
            try {
                throw new MaxRetriesReachedException();
            } catch (MaxRetriesReachedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}