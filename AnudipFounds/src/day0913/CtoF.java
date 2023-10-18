package day0913;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
            Demo1 obj = new Demo1();
            obj.simpleInterest();
            obj.temprature();
    }
}

class Demo1 {
    void simpleInterest(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal : ");
        float principal = scanner.nextFloat();

        System.out.print("Enter the roi: ");
        float rate = scanner.nextFloat();

        System.out.print("Enter time :");
        float time = scanner.nextFloat();

        float si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
    }

    void temprature(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float celsius = scanner.nextFloat();

        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}