package src.pro.sky.java.course1.coursework1;

public class Main {

    public static Employee[] employee = new Employee[10];
    static double sumSalary = 0;
    static double newSalary;
    static double newSalaryDepartent;
    static double sumSalaryDepartmen;
    static int choiceDepartment = 2;
    static int indexPercent = 10;
    static int salarySelection = 50000;

    public static void main(String[] args) {

        employee[0] = new Employee("Имя1", "Отчество1", "Фамилия1", 1, 30000);
        employee[1] = new Employee("Имя2", "Отчество2", "Фамилия2", 2, 35000);
        employee[2] = new Employee("Имя3", "Отчество3", "Фамилия3", 3, 40000);
        employee[3] = new Employee("Имя4", "Отчество4", "Фамилия4", 2, 45000);
        employee[4] = new Employee("Имя5", "Отчество5", "Фамилия5", 5, 50000);
        employee[5] = new Employee("Имя6", "Отчество6", "Фамилия6", 1, 55000);
        employee[6] = new Employee("Имя7", "Отчество7", "Фамилия7", 2, 60000);
        employee[7] = new Employee("Имя8", "Отчество8", "Фамилия8", 4, 65000);
        employee[8] = new Employee("Имя9", "Отчество9", "Фамилия9", 4, 70000);
        employee[9] = new Employee("Имя10", "Отчество10", "Фамилия10", 5, 75000);

        PrintAllEmployee(); // Полный список со всеми данными
        CalculationSumSalary(); // Сумма затрат на зарплату в месяц
        SearchMinSalary(); // Сотрудник с минимальной ЗП
        SearchMaxSalary(); // Сотрудник с максимальной ЗП
        CalculationAveregeSalary(); // Среднее значение зарплаты
        PrintNameAllEmployee(); // Список всех сотрудников - только ФИО

        IndexingSalary(); // Индексация зарплат у всех сотрудников на ХЗ % // ДОРАБОТАТЬ !!!
        SearchMinSalaryDepartment(choiceDepartment); // Минимальная ЗП сотрудника по отделу
        SearchMaxSalaryDepartment(); // Максимальная ЗП сотрудника по отделу
        CalculationSumSalaryDepartment(); // Сумма затрат на зарплату в месяц по Отделу
        CalculationAveregeSalaryDepartment(); // Среднее значение зарплаты по Отделу
        IndexingSalaryDepartment(indexPercent); // Индексация зарплат по Отделу
        PrintEmployeeWithoutDepartment(); // Список всех сотрудников - без Отдела
        PrintEmployeeSalaryDown(salarySelection); // Сотрудники с ЗП ниже указанной
        PrintEmployeeSalaryUp(salarySelection); // Сотрудники с ЗП выше указанной
    }

    public static void PrintAllEmployee() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    public static void CalculationSumSalary() {
        for (Employee employee : employee) {
            sumSalary += employee.getSalary();
        }
        System.out.println("Сумма всех затрат в месяц = " + sumSalary);
    }

    public static void SearchMinSalary() {
        double minSalary = Integer.MAX_VALUE;
        Employee[] employeeTest = new Employee[1];
        for (Employee employee : employee) {
                if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeTest[0] = employee;
            }
        }
        System.out.println("Минимальная зарплата = " + minSalary + " у сотрудника " + employeeTest[0].getLastName() + " из " +
                employeeTest[0].getDepartment() + " отдела");
    }

    public static void SearchMaxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        Employee[] employeeTest = new Employee[1];
        for (Employee employee : employee) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    employeeTest[0] = employee;
                }
            }
        System.out.println("Максимальная зарплата = " + maxSalary+ " у сотрудника " + employeeTest[0].getLastName() + " из " +
                employeeTest[0].getDepartment() + " отдела");
    }

    public static void CalculationAveregeSalary() {
        double averegeSalary;
        averegeSalary = sumSalary / employee.length;
        System.out.println("Среднее значение зарплат - " + averegeSalary);
    }

    public static void PrintNameAllEmployee() {
        for (Employee employee : employee) {
            System.out.println(employee.getId() + ": " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }

    public static void IndexingSalary() {
        for (Employee employee : employee) {
            newSalary = employee.getSalary() + (employee.getSalary() * indexPercent/100);
            System.out.println(employee.getId() + ": После индесации на- " + indexPercent + " % " + employee.getLastName() + " " +
                    employee.getFirstName() + " ЗП станет - " + newSalary);
        }
    }

    public static void SearchMinSalaryDepartment(int choiceDepartment) {
        Employee[] employeeTest = new Employee[1];
        double minSalaryDepartment = Integer.MAX_VALUE;
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                if (employee.getSalary() < minSalaryDepartment) {
                    minSalaryDepartment = employee.getSalary();
                    employeeTest[0] = employee;
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе № " + choiceDepartment + " - " + minSalaryDepartment +
                " у сотрудника " + employeeTest[0].getLastName() + " " + employeeTest[0].getFirstName());
    }

    public static void SearchMaxSalaryDepartment() {
        Employee[] employeeTest = new Employee[1];
        double maxSalaryDepartment = Integer.MIN_VALUE;
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                if (employee.getSalary() > maxSalaryDepartment) {
                    maxSalaryDepartment = employee.getSalary();
                    employeeTest[0] = employee;
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе № " + choiceDepartment + " - " + maxSalaryDepartment +
                " у сотрудника " + employeeTest[0].getLastName() + " " + employeeTest[0].getFirstName());
    }

    public static void CalculationSumSalaryDepartment() {
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                sumSalaryDepartmen += employee.getSalary();
            }
        }
        System.out.println("Сумма всех затрат за месяц в Отделе № " + choiceDepartment + " = " + sumSalaryDepartmen);
    }

    public static void CalculationAveregeSalaryDepartment() {
        int emploeyeeInDepartmen = 0;
        double averegeSalaryInDepartment;
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                emploeyeeInDepartmen++;
            }
        }
        averegeSalaryInDepartment = sumSalaryDepartmen / emploeyeeInDepartmen;
        System.out.println("Средняя зарплата в Отделе № " + choiceDepartment + " состоит из " + emploeyeeInDepartmen +
                " сотрудников = " + averegeSalaryInDepartment);
    }

    public static void IndexingSalaryDepartment(int indexPercent) {
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                newSalaryDepartent = employee.getSalary() + (employee.getSalary() * indexPercent / 100);
                System.out.println(": После индесации в Отделе № " + choiceDepartment + " на " +
                        indexPercent + " % у сотрудника " + employee.getLastName() + " " +
                        employee.getFirstName() + " ЗП станет - " + newSalaryDepartent);
            }
        }
    }

    public static void PrintEmployeeWithoutDepartment() {
        for (Employee employee : employee) {
            System.out.println("id:" + employee.getId() + " ФИО: " + employee.getLastName()+ " " +
                    employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getSalary());
        }
    }

    public static void PrintEmployeeSalaryDown(int salarySelection) {
        for (Employee employee : employee) {
            if (employee.getSalary() < salarySelection) {
                System.out.println("id:" + employee.getId() + " Сотрудник с ЗП ниже - " + salarySelection +
                        " ФИО: " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() +
                        " ЗП: " + employee.getSalary());
            }
        }
    }

    public static void PrintEmployeeSalaryUp(int salarySelection) {
        for (Employee employee : employee) {
            if (employee.getSalary() >= salarySelection) {
                System.out.println("id:" + employee.getId() + " Сотрудник с ЗП выше или равно - " + salarySelection +
                        " ФИО: " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() +
                        " ЗП: " + employee.getSalary());
            }
        }
    }
}