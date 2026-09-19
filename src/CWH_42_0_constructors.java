class MyMainEmployee {
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
        salary = 10000;
    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
        salary = 10000;
    }

    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
        salary = 10000;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
}

public class CWH_42_0_constructors {
    public static void main(String[] args) {

        MyMainEmployee divyanshu = new MyMainEmployee();

        System.out.println(divyanshu.getId());
        System.out.println(divyanshu.getName());
        System.out.println(divyanshu.getSalary());
    }
}