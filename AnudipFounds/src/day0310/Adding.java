package day0310;

import java.util.Scanner;
public class Adding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter a character like + * - / : ");
        String charValue = scanner.next();

        if(charValue.equals("+")){
            float sum = num1 + num2;
            System.out.println("Sum: " + sum);
        }
        else if(charValue.equals("-")){
            float difference = num1 - num2;
            System.out.println("Difference: " + difference);
        }
        else if(charValue.equals("*")){
            float product = num1 * num2;
            System.out.println("Product: " + product);
        }
        else if (charValue.equals("/")){
            float division = num1 / num2;
            System.out.println("Division: " + division);
        }       
        System.out.println("Product: " + charValue.charAt(0));

    }
}

