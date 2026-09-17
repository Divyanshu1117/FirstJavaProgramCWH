public class CWH_26_arrays {
    public static void main(String[] args) {
        // ClassRoom Of 500 Students:- You Have To Store Marks Of These 500 Students:-
//        You Have 2 Options:-
//            1. Create 500 Variables.
//            2. Use Arrays (Recommended)

        // There Are Three Main Ways To Create An Array In Java:-

        // 1. Declaration And Memory Allocation:-
//         int [] marks = new int[5];

        // 2. Declaration And Then Memory Allocation:-
//         int [] marks;
//         marks = new int [5];
        // Initialization:-
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 50;
//        marks[3] = 50;
//        marks[4] = 70;
//        marks[5] = 78; // Throws An Error:-
//        System.out.println(marks[2]);

        // 3. Declaration, Memory Allocation And Initialization Together:-
        int[] marks = {98, 45, 79, 99, 80};
        System.out.println(marks[4]);
    }
}