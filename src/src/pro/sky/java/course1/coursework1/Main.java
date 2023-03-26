package src.pro.sky.java.course1.coursework1;

public class Main {

    public static Employee[] employee = new Employee[10];
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

        printAllEmployee(); // Полный список со всеми данными
        calculateSumSalary(); // Сумма затрат на зарплату в месяц
        searchMinSalary(); // Сотрудник с минимальной ЗП
        searchMaxSalary(); // Сотрудник с максимальной ЗП
        calculateAveregeSalary(); // Среднее значение зарплаты
        printNameAllEmployee(); // Список всех сотрудников - только ФИО

        indexingSalary(); // Индексация зарплат у всех сотрудников на ХЗ % // ДОРАБОТАТЬ !!!
        searchMinSalaryDepartment(choiceDepartment); // Минимальная ЗП сотрудника по отделу
        searchMaxSalaryDepartment(choiceDepartment); // Максимальная ЗП сотрудника по отделу
        calculateSumSalaryDepartment(choiceDepartment); // Сумма затрат на зарплату в месяц по Отделу
        calculateAveregeSalaryDepartment(choiceDepartment); // Среднее значение зарплаты по Отделу
        indexingSalaryDepartment(indexPercent); // Индексация зарплат по Отделу
        printEmployeeWithoutDepartment(); // Список всех сотрудников - без Отдела
        printEmployeeSalaryDown(salarySelection); // Сотрудники с ЗП ниже указанной
        printEmployeeSalaryUp(salarySelection); // Сотрудники с ЗП выше указанной
    }

    public static void printAllEmployee() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    public static void calculateSumSalary() {
        double sumSalary = 0;
        for (Employee employee : employee) {
            sumSalary += employee.getSalary();
        }
        System.out.println("Сумма всех затрат в месяц = " + sumSalary);
    }

    public static void searchMinSalary() {
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employee) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
            System.out.println("Минимальная зарплата = " + minSalary);

    }

    public static void searchMaxSalary() {

        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employee) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        System.out.println("Максимальная зарплата = " + maxSalary);
    }

    public static void calculateAveregeSalary() {
        double sumSalary = 0;
        double averegeSalary;
        for (Employee employee : employee) {
            sumSalary += employee.getSalary();
        }
        averegeSalary = sumSalary / employee.length;
        System.out.println("Среднее значение зарплат - " + averegeSalary);
    }

    public static void printNameAllEmployee() {
        for (Employee employee : employee) {
            System.out.println(employee.getId() + ": " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }

    public static void indexingSalary() {
        double newSalary = 0;
        for (Employee employee : employee) {
            newSalary = employee.getSalary() + (employee.getSalary() * indexPercent/100);
            employee.setSalary(newSalary);
            System.out.println(employee.getId() + ": После индесации на- " + indexPercent + " % " + employee.getLastName() + " " +
                    employee.getFirstName() + " ЗП станет - " + employee.getSalary());
        }
    }

    public static void searchMinSalaryDepartment(int choiceDepartment) {
        double minSalaryDepartment = Integer.MAX_VALUE;
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                if (employee.getSalary() < minSalaryDepartment) {
                    minSalaryDepartment = employee.getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе № " + choiceDepartment + " - " + minSalaryDepartment);
    }

    public static void searchMaxSalaryDepartment(int choiceDepartment) {
        double maxSalaryDepartment = Integer.MIN_VALUE;
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                if (employee.getSalary() > maxSalaryDepartment) {
                    maxSalaryDepartment = employee.getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе № " + choiceDepartment + " - " + maxSalaryDepartment);
    }

    public static void calculateSumSalaryDepartment(int choiceDepartment) {
        double sumSalaryDepartmen = 0;
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                sumSalaryDepartmen += employee.getSalary();
            }
        }
        System.out.println("Сумма всех затрат за месяц в Отделе № " + choiceDepartment + " = " + sumSalaryDepartmen);
    }

    public static void calculateAveregeSalaryDepartment(int choiceDepartment) {
        double sumSalaryDepartmen = 0;
        int emploeyeeInDepartmen = 0;
        double averegeSalaryInDepartment;
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                sumSalaryDepartmen += employee.getSalary();
                emploeyeeInDepartmen++;
            }
        }
        averegeSalaryInDepartment = sumSalaryDepartmen / emploeyeeInDepartmen;
        System.out.println("Средняя зарплата в Отделе № " + choiceDepartment + " состоит из " + emploeyeeInDepartmen +
                " сотрудников = " + averegeSalaryInDepartment);
    }

    public static void indexingSalaryDepartment(int indexPercent) {
        double newSalaryDepartent = 0;
        for (Employee employee : employee) {
            if (employee.getDepartment() == choiceDepartment) {
                newSalaryDepartent = employee.getSalary() + (employee.getSalary() * indexPercent / 100);
                employee.setSalary(newSalaryDepartent);
                System.out.println(": После индесации в Отделе № " + choiceDepartment + " на " +
                        indexPercent + " % у сотрудника " + employee.getLastName() + " " +
                        employee.getFirstName() + " ЗП станет - " + employee.getSalary());
            }
        }
    }

    public static void printEmployeeWithoutDepartment() {
        for (Employee employee : employee) {
            System.out.println("id:" + employee.getId() + " ФИО: " + employee.getLastName()+ " " +
                    employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getSalary());
        }
    }

    public static void printEmployeeSalaryDown(int salarySelection) {
        for (Employee employee : employee) {
            if (employee.getSalary() < salarySelection) {
                System.out.println("id:" + employee.getId() + " Сотрудник с ЗП ниже - " + salarySelection +
                        " ФИО: " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() +
                        " ЗП: " + employee.getSalary());
            }
        }
    }

    public static void printEmployeeSalaryUp(int salarySelection) {
        for (Employee employee : employee) {
            if (employee.getSalary() >= salarySelection) {
                System.out.println("id:" + employee.getId() + " Сотрудник с ЗП выше или равно - " + salarySelection +
                        " ФИО: " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() +
                        " ЗП: " + employee.getSalary());
            }
        }
    }
}