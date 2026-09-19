class My_Employee {

    private int id;
    private String name;
    private int salary;

    // Constructor 1:-
    public My_Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Constructor 2 - overloaded constructor:-
    public My_Employee(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class CWH_42_1_quiz {

    public static void main(String[] args) {

        My_Employee divyanshu = new My_Employee(1117, "Divyanshu", 10000);

        System.out.println(divyanshu.getId());
        System.out.println(divyanshu.getName());
        System.out.println(divyanshu.getSalary());
    }
}