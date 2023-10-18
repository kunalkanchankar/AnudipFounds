package day1003;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String charValue = scanner.next();
		if(charValue.charAt(0)=='a' || charValue.charAt(0)=='e' || charValue.charAt(0)=='i' || charValue.charAt(0)=='o' || charValue.charAt(0)=='u' ) {
        	System.out.print(charValue.charAt(0)+" is a Vowel");	
        }
		else if(charValue.charAt(0)=='A' || charValue.charAt(0)=='E' || charValue.charAt(0)=='I' || charValue.charAt(0)=='O' || charValue.charAt(0)=='U') {
        	System.out.print(charValue.charAt(0)+" is a Vowel");
        }
		else {
        	System.out.print(charValue.charAt(0)+" is a Consonant");
        }
		for(int i = 0 ; i < charValue.length(); i++) {
			System.out.print(" "+charValue.charAt(i));
		}
	}
}
