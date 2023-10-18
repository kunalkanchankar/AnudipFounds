package day0925;

import java.util.Scanner;

public class TaxInterest {
	public static void main(String[] args) {
		TaxDemo obj = new TaxDemo();		
	}
}
class TaxDemo {
    TaxDemo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String ename = scanner.nextLine();

        System.out.print("Enter annual income (in INR): ");
        double income = scanner.nextDouble();

        double incomeTax = 0.0;
        if (income <= 250000) {
            incomeTax = 0.0;
        } else if (income <= 500000) {
            incomeTax = (income - 250000) * 0.10;
        } else if (income <= 1000000) {
            incomeTax = 30000 + (income - 500000) * 0.20;
        } else {
            incomeTax = 130000 + (income - 1000000) * 0.30;
        }
        // Display employee name and income tax
        System.out.println("Employee Name: " + ename);
        System.out.println("Income Tax: INR " + incomeTax);
    }
}
