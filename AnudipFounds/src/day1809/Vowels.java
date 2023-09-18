package day1809;
import java.util.Scanner;
public class Vowels {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char charValue = scanner.next().charAt(0);
		if(charValue=='a' || charValue=='e' || charValue=='i' || charValue=='o' || charValue=='u' ) {
        	System.out.print(charValue+" is a Vowel");	
        }
		else if(charValue=='A' || charValue=='E' || charValue=='I' || charValue=='O' || charValue=='U') {
        	System.out.print(charValue+" is a Vowel");
        }
		else {
        	System.out.print(charValue+" is a Consonant");
        }
	}
}
