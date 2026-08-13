import java.util.Scanner;
public class Employee {
    private String name;
    private int age;
    private double salary;

    private static int count = 0;

    Employee() {
        count++;
    }

    public void getData(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }

    // Bubble sort by salary (Descending)
    public static void sortData(Employee[] emp) {
        Employee temp;

        for (int i = 0; i < emp.length - 1; i++) {
            for (int j = 0; j < emp.length - i - 1; j++) {
                if (emp[j].salary < emp[j + 1].salary) {
                    temp = emp[j];
                    emp[j] = emp[j + 1];
                    emp[j + 1] = temp;
                }
            }
        }
    }

    public static int getCount() {
        return count;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            emp[i].getData(name, age, salary);
        }

        Employee.sortData(emp);

        System.out.println("\nEmployees Sorted by Salary (Highest to Lowest):\n");

        for (int i = 0; i < n; i++) {
            emp[i].printData();
        }

        System.out.println("Number of objects created in the program: " + Employee.getCount());

        sc.close();
    }
}