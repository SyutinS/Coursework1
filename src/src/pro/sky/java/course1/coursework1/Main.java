package src.pro.sky.java.course1.coursework1;

public class Main {

    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee(new Name("Имя1", "Отчество1", "Фамилия1"), 1, 30000);
        employee[1] = new Employee(new Name("Имя2", "Отчество2", "Фамилия2"), 2, 35000);
        employee[2] = new Employee(new Name("Имя3", "Отчество3", "Фамилия3"), 3, 40000);
        employee[3] = new Employee(new Name("Имя4", "Отчество4", "Фамилия4"), 4, 45000);
        employee[4] = new Employee(new Name("Имя5", "Отчество5", "Фамилия5"), 5, 50000);
        employee[5] = new Employee(new Name("Имя6", "Отчество6", "Фамилия6"), 5, 55000);
        employee[6] = new Employee(new Name("Имя7", "Отчество7", "Фамилия7"), 4, 60000);
        employee[7] = new Employee(new Name("Имя8", "Отчество8", "Фамилия8"), 3, 65000);
        employee[8] = new Employee(new Name("Имя9", "Отчество9", "Фамилия9"), 2, 70000);
        employee[9] = new Employee(new Name("Имя10", "Отчество10", "Фамилия10"), 1, 75000);

        Counter(); // ?????
        PrintAllEmployee(); // Полный список со всеми данными
        CalculationSumSalary(); // Сумма затрат на зарплату в месяц
        SearchMinSalary(); // Сотрудник с минимальной ЗП
        SearchMaxSalary(); // Сотрудник с максимальной ЗП
        CalculationAveregeSalary(); // Среднее значение зарплаты
        PrintNameAllEmployee(); // Список Всех сотрудников - ФИО
    }

    public static void Counter() { /////а Может и не надо оно???
        Employee.id = 0;
        for (Employee employee : employee) {
            Employee.id++;
//            System.out.print(id);
        }
    }

    public static void PrintAllEmployee() {
        Employee.id = 0;
        for (Employee employee : employee) {
            Employee.id++;
            System.out.println(employee);
        }
    }

    public static void CalculationSumSalary() {
        double sumSalary = 0;
        for (Employee getSalary : employee) {
            sumSalary += getSalary.getSalary();
        }
        System.out.println("Сумма всех затрат в месяц = " + sumSalary);
    }


    public static void SearchMinSalary() {
        double minSalary = Integer.MAX_VALUE;
        Employee[] employeeBest = {null};
        for (Employee employee : employee) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeBest[0] = employee;
            }
        }
        System.out.println("Минимальная зарплата = " + minSalary + " у сотрудника " + employeeBest[0].getName() + " из "
                + employeeBest[0].getDepartment() + " отдела");
    }

    public static void SearchMaxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        Employee[] employeeBest = {null};
        for (Employee employee : employee) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeBest[0] = employee;
            }
        }
        System.out.println("Максимальная зарплата = " + maxSalary+ " у сотрудника " + employeeBest[0].getName() + " из "
                + employeeBest[0].getDepartment() + " отдела");
    }

    public static void CalculationAveregeSalary() {
        double averegeSalary;
        double sumSalary = 0;
        for (Employee getSalary : employee) {
            sumSalary += getSalary.getSalary();
        }
        averegeSalary = sumSalary / Employee.id;
        System.out.println("Среднее значение зарплат" + averegeSalary);
    }

    public static void PrintNameAllEmployee() {
        Employee.id = 0;
        for (Employee employee : employee) {
            Employee.id++;
            System.out.println(Employee.id + ": " + employee.getName());
        }
    }
}