package day1003;

import java.util.Scanner;

public class SplitExample {

	public static void main(String[] args) {
		String text = "Java is a fun Programming Language";
		String num = "11#22#33#44#55";
		
		String[] arr= num.split("#");
		for(String s:arr) {
			System.out.println(s);
		}
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num1 = scanner.nextLine();
		String str = "1,2,3,4,5";
		int mul=1;
		arr= str.split(",");
		for(String s:arr) {
			int i = Integer.parseInt(s);
			mul*=i;
			System.out.println(mul);
		}
//		System.out.println(mul);
	}
}
