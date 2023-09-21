package day2009;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of row : ");
        int row = scanner.nextInt();
        
        for (int i=1; i<=row; i++){ 
            for (int j=row; j>=i; j--){
                System.out.print(j+" "); //Put * star for star pattern
            }
            System.out.println();
        }
    }
}
