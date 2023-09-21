package day2109;

import java.util.Scanner;

public class BodyMass {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//		Entring value for weight
        System.out.print("Enter your weight in kilogram: ");
        double weight = scanner.nextDouble();
//        Entering Value for height
        System.out.print("Enter your height in meter: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height); //this is the formula to calculate bmi
        // this is where we find BMI category for individuals
        String category;
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Healthy");
        } 
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } 
        else {
            System.out.println("you are suffering from obesity");
        }

   }
}
