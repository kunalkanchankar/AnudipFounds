package day0921;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		int n = 3; // we need to print 3 line in the pattern

        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // first we print increasing order like 1 2 3
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // the we print decreasing orde r like 3 2 1 
             for (int k = i -1; k >= 1; k--) {
                System.out.print(k + " "); // we use print because we need to print values in single line 
            }
            // when it false it will go to new line 
            System.out.println();
        }
		
	}
}
