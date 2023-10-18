package day0927;

public class SwapLastandFirst {

	public static void main(String[] args) {
		int[] marks= {30,24,26,15,12};
		int temp = 0;
		
		System.out.print("Before Swap : \nfirst = "+marks[0]+"\nLast = "+marks[marks.length-1]);
		temp = marks[0];
		marks[0] = marks[marks.length-1];
		marks[marks.length-1] = temp;
		System.out.print("\nAfter Swap : \nfirst = "+marks[0]+"\nLast = "+marks[marks.length-1]);

	}

}
