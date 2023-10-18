package day0927;

public class ArraySum {

	public static void main(String[] args) {
		int[] marks= {30,24,26,15,12};
		int sum = 0;
		for(int i=0;i<marks.length;i++)	{
			sum = marks[i]+sum;
			System.out.print(marks[i]+" + " );
		}
		System.out.print("0 = "+sum);
	}
}
