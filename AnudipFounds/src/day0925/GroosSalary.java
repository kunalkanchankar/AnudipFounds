package day0925;

import java.util.Scanner;

public class GroosSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee's basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate allowances
        double da = 0.12 * basicSalary; 
        double hra = 0.13 * basicSalary; 
        double pf = 0.15 * basicSalary;  

        // Calculate gross salary
        double grossSalary = basicSalary + da + hra - pf;

        // Display allowances and gross salary
        System.out.println("Dearness Allowance:" + da); 
        System.out.println("House Rent Allowance: " + hra);
        System.out.println("Provident Fund: " + pf);
        System.out.println("Gross Salary : " + grossSalary);
    }
}
