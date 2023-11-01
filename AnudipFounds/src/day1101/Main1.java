package day1101;

import java.util.Scanner;

public class Main1 {
	public static void checkage(int age) throws InvaildAgeException {
		if(age>=19) {
			System.out.println("You are Eligiblr");
		}
		else {
			throw new InvaildAgeException("Age is not vaild");
		}
	}
	public static void main(String args[]) throws InvaildAgeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		int newage = sc.nextInt();
		checkage(newage);
	}
}
