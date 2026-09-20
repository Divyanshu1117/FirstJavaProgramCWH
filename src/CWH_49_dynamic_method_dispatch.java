// RunTime Polymorphism:-

class Phone {
    public void showTime() {
        System.out.println("Time is 12:53 PM");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing Music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone(); // Allowed:-
//        SmartPhone smobj = new SmartPhone(); // Allowed:-
//        obj.on();

//        Runtime Polymorphism is also known as Dynamic Method Dispatch.
//        Runtime polymorphism occurs when the method to be executed is determined at runtime
//        using method overriding, where a parent class reference refers to a child class object.
//        Super Class Reference = Sub Class Object:-
        Phone obj = new SmartPhone(); // Yes it is allowed:-
//        SmartPhone obj2 = new Phone(); // Not Allowed:-

        obj.showTime();
        obj.on();
//        obj.music(); // Not Allowed:-
    }
}