package src.pro.sky.java.course1.coursework1;

public class Employee {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final int department; // отделы от 1 до 5
    private double salary;
    private int id;
    private static int idCounter = 1;

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int setDepartment() {
        return department;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    @Override
    public String toString() {
        return "id: " + id +
                " ФИО: " + lastName + " " + firstName + " " + middleName +
                " ОТДЕЛ: " + department +
                " ЗАРПЛАТА: " + salary;
    }

}
