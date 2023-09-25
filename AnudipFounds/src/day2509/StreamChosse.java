package day2509;

import java.util.Scanner;

public class StreamChosse {
	public static void main(String[] args) {
		Demo obj = new Demo();		
	}
}

class Demo {
	public Demo() {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter English mark: ");
        int engmark = scanner.nextInt();

        System.out.print("Enter Maths mark: ");
        int mathmark = scanner.nextInt();

        System.out.print("Enter Science mark: ");
        int scimark = scanner.nextInt();

        if (engmark >= 80 && mathmark >= 80 && scimark >= 80) {
            System.out.println("Pure Science");
        } 
        else if (engmark >= 80 && scimark >= 80 && mathmark >= 60) {
            System.out.println("Bio science");
        } 
        else if (engmark >= 60 && mathmark >= 60 && scimark >= 60) {
            System.out.println("General science");
        } 
        else {
            System.out.println("No stream Given");
        }
    }
}
