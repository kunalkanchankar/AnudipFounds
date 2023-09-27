package day2709;

public class ReverseArray {

	 public static void main(String[] args) {
	    	int[] marks= {30,24,26,15,12,45,40,65,54};
	    	int temp = 0;
	    	
	    	for (int i = 0; i < marks.length/2; i++){  
	    		temp = marks[marks.length-1-i];
	    		marks[marks.length-1-i] = marks[i];
	    		marks[i] = temp;
	    	}
	    	System.out.println("Reverse Array : ");
	    	for(int i = 0;i<marks.length;i++) {
	    		System.out.print(" "+marks[i]);
		    }
	    }
}
