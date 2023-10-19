package day1019;

public class Generic2 {
	public static<A> void print(A[] elements) {
		for(A ele : elements) {
			System.out.println(ele);
		}
	}
	public static void main(String[] args) {
		Integer[] number = {2,5,4,8,7,36};
		String[] name = {"kunal","Tarun","Jhon"};
		print(number);
		print(name);

	}

}
