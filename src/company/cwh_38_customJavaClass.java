package company;

class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class cwh_38_customJavaClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee joy = new Employee();
        Employee munni = new Employee();

        joy.name = "Joy Chowdhury";
        joy.id = 453;
        joy.salary = 34000;

        munni.name = "Shahin Sultana Munni";
        munni.id = 19;
        munni.salary = 54000;

        System.out.println(joy.name);
        System.out.println(joy.id);
        joy.printDetails();
        munni.printDetails();
        int salary = joy.getSalary();
        int salary2 = munni.getSalary();

        System.out.println("Joy's monthly salary is :");
        System.out.println(salary);
        System.out.println("Munni's monthly salary is :");
        System.out.println(salary2);
    }
}
