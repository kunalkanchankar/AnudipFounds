package day0920;

import java.util.Scanner;
public class Exponent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("Enter a numbers:");
        int  num1 = scanner.nextInt();
        System.out.println("Enter power of :");
        int  num2 = scanner.nextInt();
        int result = 1;
        for(int i = 1;i<=num2;i++) {
        	result = num1 * result;
        }
        System.out.println("Result of "+num1+" power of "+num2+" is : "+result);
	}
}
