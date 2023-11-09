//print Fibonnaci series as well as even numbers between 1 to 100 using two seperate threads.Use join method for that.

package day1109;


class Fibonacci extends Thread {
    public void run(){
        int n = 10; // Number of Fibonacci 
        int a = 0, b =1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 2;i <n;i++) {
            int c = a + b;
            System.out.print(c +" ");
            a = b;
            b = c;
        }
    }
}

class EVENOdd extends Thread {
    public void run() {
        System.out.print("\nEven Numbers: ");
        for (int i = 2; i <= 100; i++) {
        	if(i%2==0) {
        		System.out.print(i+" ");
        
        	}
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Fibonacci obj1 = new Fibonacci();
        EVENOdd obj2 = new EVENOdd();

        obj1.start();

        try {
            obj1.join(); // it Wait for the Fibonacci method 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        obj2.start();
        try {
            obj2.join(); // it Wait for the Fibonacci method 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
