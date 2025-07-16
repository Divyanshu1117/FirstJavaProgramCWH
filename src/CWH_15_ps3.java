public class CWH_15_ps3 {
    public static void main(String[] args) {
//        Q1:-
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

//        Q2:-
        String text = "To Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

//        Q3:-
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Harry");
        System.out.println(letter);

//        Q4:-
        String myString = "This string contain double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        Q5:-
        String myLetter = "Dear Harry, \n\tThis Java Course Is Nice. \n\tThanks!";
        System.out.println(myLetter);
    }
}
