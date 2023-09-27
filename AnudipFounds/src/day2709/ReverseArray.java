package day2709;

public class ReverseArray {

	 public static void main(String[] args) {
	    	int[] marks= {30,24,26,15,12,45,40,65,54};
	    	int temp = 0;
	    	for (int i = marks.length; i <= marks.length; i--){  
	            for (int j = i + 1; j < marks.length; j++) {  
	                if (marks[i] > marks[j]) {  
	                    temp = marks[i];  
	                    marks[i] = marks[j];  
	                    marks[j] = temp;  
	                }
	            }
	        }
	    	System.out.println("\nMinimum marks : "+marks[0]);
	        System.out.println("Maximum marks : "+marks[marks.length-1]);
	        System.out.println("second Maximum marks : "+marks[marks.length-2]);  
	    }
}
