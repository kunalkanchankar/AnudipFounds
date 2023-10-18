package day1011;

interface Multiple{
	public int mul(int a,int b);
}

public class Arithmetic {
	public static void main(String args[]) {
		Multiple mul = (x,y) ->{
			return x*y;
		};
		System.out.println(mul.mul(10,20));
	}
}


	
	
	
	
	
