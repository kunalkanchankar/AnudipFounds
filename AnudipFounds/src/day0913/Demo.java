package day0913;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        scanner.nextLine();
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        System.out.println("You entered an integer: " + intValue);
        System.out.println("You entered a float: " + floatValue);
        System.out.println("You entered a string: " + stringValue);
    }
}

