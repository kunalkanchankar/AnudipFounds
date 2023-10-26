package day1025;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        import java.util.ArrayList;
        import java.util.Scanner;

        public class ArrayListSearch {
            public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(12);
                numbers.add(34);
                numbers.add(56);
                numbers.add(100);
                numbers.add(35);

                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Enter a number to check if it's present in the ArrayList: ");
                int num = scanner.nextInt();

                if (numbers.contains(num)) {
                    System.out.println(num + " is present in the ArrayList.");
                } else {
                    System.out.println(num + " is not present in the ArrayList.");
                }
            }
        }

        
        System.out.println("Enter numbers: ");    
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {break;}
            num.add(input);
        }int sum = 0;
        for (int n : num) {
            sum += n;}
        System.out.println("Sum of numbers: " + sum);
        
        for (int n : num) {
            if(n%2==1) {
            	System.out.println(n);
         
            }
        }
    }
}
