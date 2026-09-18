class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class CWH_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee divyanshu = new Employee(); // Instantiating a new Employee Object:-
        Employee john = new Employee(); // Instantiating a new Employee Object:-

//        Setting Attributes For Divyanshu:-
        divyanshu.id = 12;
        divyanshu.name = "Divyanshu";
        divyanshu.salary = 70;

//        Setting Attributes For John:-
        john.id = 13;
        john.name = "John Singh";
        john.salary = 40;

//        Printing the Attributes:-
//        System.out.println(Divyanshu.id);
//        System.out.println(Divyanshu.name);

        divyanshu.printDetails();
        john.printDetails();
        int salary = divyanshu.getSalary();
        System.out.println(salary);
    }
}