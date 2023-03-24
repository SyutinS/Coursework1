package src.pro.sky.java.course1.coursework1;

public class Employee {

    private final Name name;
    public final int department; // отделы от 1 до 5
    public final double salary;
    public static int id;

    public Employee(Name name, int department, double salary) {//String firstName, String middleName, String lastName) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Name getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int setDepartment() {
        return department;
    }

    public double setSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "№" + id + ": " + name + " ОТДЕЛ: " + department + " ЗАРПЛАТА: " + salary;
    }
}
