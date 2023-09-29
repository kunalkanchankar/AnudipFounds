package day2809;

public class Transpose {
	public static void main(String[] args) {
		int a[][]={{1,3,4},{3,4,5}};
		
		int c[][] = new int[3][2] ;
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[j][i] = a[i][j];
			}
		}
		for(int i = 0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(" "+c[i][j]);
			}
			System.out.print("\n");
		}
	}
}
