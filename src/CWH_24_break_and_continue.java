public class CWH_24_break_and_continue {
    public static void main(String[] args) {
//        Break And Continue Using Loops:-
//        Break Statements:-
//        For Loop:-
//        for (int i = 0; i < 5; i++){
//            System.out.println(i);
//            System.out.println("Java Is Great! ");
//            if(i == 2){
//                System.out.println("Ending The Loop:-");
//                break;
//            }
//        }
//        While Loop:-
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            System.out.println("Java Is Great! ");
//            if (i == 2) {
//                System.out.println("Ending The Loop! ");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loop Ends Here:- ");

//        Do-While Loop:-
//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("Java Is Great! ");
//            if (i == 2) {
//                System.out.println("Ending The Loop! ");
//                break;
//            }
//            i++;
//        }while (i < 5);
//            System.out.println("Loop Ends Here:- ");


//        Continue Statement:-
//        For Loop:-
//        for (int i = 0; i < 50; i++){
//            if(i == 2)
//            {
//                System.out.println("Ending The Loop:-");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java Is Great! ");
//        }

//        Do_While Loop:-
       int i = 0;
       do{
       i++;
            if(i == 2)
            {
                System.out.println("Ending The Loop:-");
                continue;
            }
            System.out.println(i);
            System.out.println("Java Is Great! ");
        }while(i < 5);
    }
}