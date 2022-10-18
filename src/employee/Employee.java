
public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee() {
    }

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public static void main(String[] args) {
        Employee workers1 = new Employee("Kemal", 2000, 45, 1985);
        double bonus = bonus(workers1.workHours);
        double raiseSalary = raiseSalary(workers1.salary, workers1.hireYear);
        double tax = tax(workers1.salary);
        printEmployees(workers1.name, workers1.salary, workers1.workHours, workers1.hireYear, bonus, raiseSalary, tax);

        System.out.println("======================");

        Employee workers2 = new Employee("Sadık Hidayet", 999, 50, 2010);
        bonus = bonus(workers2.workHours);
        raiseSalary = raiseSalary(workers2.salary, workers2.hireYear);
        tax = tax(workers2.salary);
        printEmployees(workers2.name, workers2.salary, workers2.workHours, workers2.hireYear, bonus, raiseSalary, tax);
    }

    public static void printEmployees(String name, double salary, int workHours, int hireYear, double bonus, double raiseSalary, double tax) {
        System.out.println("Full Name: " + name+
                            "\nSalary: " + salary+
                            "\nWork Hours: " + workHours+
                            "\nHire Year: " + hireYear+
                            "\nTax: " + tax+
                            "\nBonus: " + bonus+
                            "\nRaise Salary: " + raiseSalary+
                            "\nSalary with tax and bonus: "+(salary+bonus-tax)+
                            "\nTotal Salary: " + (salary + bonus + raiseSalary - tax));
    }

    private static double bonus(int workHours) {
        if (workHours - 40 > 0) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public static double raiseSalary(double salary, int hireYear) {
        if (2021 - hireYear < 10) {
            return (int) (salary * (0.05));
        } else if (2021 - hireYear < 20) {
            return (int) (salary * (0.1));
        }
        return (int) (salary * (0.15));
    }

    public static double tax(double salary) {

        if (salary < 1000) {
            return 0;
        } else {
            return (salary * (0.03));
        }
    }

}
