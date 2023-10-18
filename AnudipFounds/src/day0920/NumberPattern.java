package day0920;

public class NumberPattern {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++){ 
            for (int j=i; j<i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
//            star1();
        }
	}
}
