package day1309;


import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        if(charValue=='+'){
            float sum = num1 + num2;
            System.out.println("Sum: " + sum);
        }
        else if(charValue=='-'){
            float difference = num1 - num2;
            System.out.println("Difference: " + difference);
        }
        else if(charValue=='*'){
            float product = num1 * num2;
            System.out.println("Product: " + product);
        }
        else if (charValue=='/'){
            float division = num1 / num2;
            System.out.println("Division: " + division);
        }
        
        System.out.println("Product: " + charValue);
  
    }
}
