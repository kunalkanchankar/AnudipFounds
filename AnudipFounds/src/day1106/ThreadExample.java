package day1106;

public class ThreadExample implements Runnable {
	public void run() {
		int[] arr1 = {20,10,30,5};
		int sum=0;
		for(int num: arr1){
			sum += num;
		}
		System.out.println("Sum of array: "+sum);
	}
	
	public static void main(String[] args) {
		ThreadExample obj=new ThreadExample();
		Thread thread=new Thread(obj);
		thread.start();
		for (int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}
 