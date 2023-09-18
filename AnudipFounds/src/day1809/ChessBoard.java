package day1809;

import java.util.Scanner;

public class ChessBoard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int num = scanner.nextInt();
    
        System.out.print("Enter column character: ");
        char ch = scanner.next().charAt(0);
	
        if(num>0&&num<9 && ch>='a' && ch<='h') {
			if(num%2==1 && ch=='a' || ch=='c' || ch=='e' || ch=='G') {
				System.out.println("black");
			}
			else {
				System.out.println("white");
			}
		}
        else {
        	System.out.println("invaild input");
        }
	}
}
