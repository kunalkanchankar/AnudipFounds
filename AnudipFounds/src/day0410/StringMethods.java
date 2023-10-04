package day0410;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.insert();
		obj.replace();
		obj.delete();
		obj.reverse();
		obj.palindrome();
	}
}
class Demo{
	void insert() {
		StringBuffer sb = new StringBuffer("Technology ");  
        sb.insert(10,"Java");  
        System.out.println(sb);  
	}
	void replace() {
		StringBuffer sb = new StringBuffer("Technology java");
		sb.replace(4,10, " Project");
		System.out.println(sb);	
	}
	void delete() {
		StringBuffer sb = new StringBuffer("Technology java");
		sb.delete(4,6);
		System.out.println(sb);
	}
	void reverse() {
		StringBuffer sb = new StringBuffer("Technology java");
		sb.reverse();
		System.out.println(sb);
	}
	void palindrome() {
		
		String str;
		String rev = "";
		Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a string:");
        str = scanner.nextLine();
 
        int size = str.length();
        for ( int i = size - 1; i >= 0; i-- ) {
        	 rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
        	System.out.println(str+" is a palindrome");	
        }
        else {
        	System.out.println( "not a palindrome");   	
        }
	}
	
		
	
}
