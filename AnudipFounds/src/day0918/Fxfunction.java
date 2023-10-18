package day0918;
import java.util.Scanner;
public class Fxfunction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int fx = 0;
        if(number<10 && number>0) {
        	fx = 2 + number;
        }
        else if(number>=10) {
        	fx = (number * number) + 2;
        }
        else {
        	System.out.println("Invalid number");
        }
        System.out.println("Result : "+ fx);
	}
}
