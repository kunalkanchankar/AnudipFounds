package day2109;

import java.util.Scanner;

public class GroupSelection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Entering value for roll number 
        System.out.print("Enter your Roll number: ");
        int rollno = scanner.nextInt();
        // this is the statment where we check the rollno in which
//        group it belongs
        if(rollno%4==1) { /* we mod divide rollno by 4 because all 
        	patterns have difference of 4 
        	and then we check which group it bolong.*/
        	System.out.println("Sapphire Group");        
        }
        else if(rollno%4==2) {
        	System.out.println("Perl Group");
        }
        else if (rollno%4==3) {
        	System.out.println("Ruby Gropu");
        } 
        else {
        	System.out.println("Emerald Group");
        } 
	}
}
