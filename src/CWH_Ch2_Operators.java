public class CWH_Ch2_Operators {
    public static void main(String[] args) {
        int a = 4;
//        1. Arithmetic Operators
//        int b = 6 % a; Modulo Operators
//        4.8%1.1 --> Return Decimal Remainder
//        2. Assignment Operators
        int b = 9;
        b += 3;
        System.out.println(b);
//      3. Comparison Operators
        System.out.println(6 == 8);
        System.out.println(6 == 6);
        System.out.println(6 > 8);
        System.out.println(6 < 8);
//      4. Logical Operator
        System.out.println(64 < 5 && 64 > 8);
        System.out.println(64 < 5 || 64 > 98);
//      5. Bitwise Operators
        System.out.println(2 & 3);
    }
}