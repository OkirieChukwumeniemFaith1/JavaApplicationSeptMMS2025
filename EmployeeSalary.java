import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        double grossSalary = hoursWorked * hourlyRate;
        double tax = grossSalary * 0.10;
        double netSalary = grossSalary - tax;

        System.out.println();
		System.out.println("=================================");
		System.out.println("Employee Name: " + name);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}