package day2009;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of row : ");
        int rows = scanner.nextInt();
        
        for (int i=1; i<=rows; i++){ 
            for (int k=rows; k>=i; k--){
                System.out.print("* ");
            }
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
            star1();
        }
    }
}
