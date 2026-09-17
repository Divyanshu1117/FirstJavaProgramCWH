public class CWH_09_ch2_op_pre {
    public static void main(String[] args) {
//        int a = 6 * 5 - 34 / 2;
        //        Precedence & Associative
        /*
        Highest precedence goes to * and / . They are then evaluated on the basis of left to right associativity
        =30-34/2
        =30-17
        =13
         */
//        int b = 60 / 5 - 34 * 2;
          /*
          =12-34*2
          =12-68
          =-56
           */
//        System.out.println(a);
//        System.out.println(b);
//        Quick Quiz:-

//        1.
//        int x = 6;
//        int y = 1;
//        int k = x * y / 2;
//        System.out.println(k);

//        2.
//        int b = 6;
//        int c = 1;
//        int a = 5;
//        int k = (b * b - 4 * a * c) / (2 * a);
//        System.out.println(k);

//        3.
//        int v = 6;
//        int u = 1;
//        int k = v * v - u * u;
//        System.out.println(k);

//        4.
        int a = 16;
        int b = 11;
        int d = 15;
        int k = a * b - d;
        System.out.println(k);
    }
}