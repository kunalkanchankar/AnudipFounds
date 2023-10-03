package day0310;

import java.util.Scanner;

public class Arrange {

	public static void main(String[] args) {
		String text = "Java is a fun Programming Language";
		
		String[] arr= text.split(" ");
		String temp="";
		for (int i = 0; i < arr.length; i++){  
            for (int j = i + 1; j < arr.length; j++) {  
            	if(arr[i].charAt(0) < arr[j].charAt(0)) {
            	System.out.print(1+" "+ arr[i]+" with "+arr[j]+"| ");
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;		
				System.out.println(arr[i]+" -> "+arr[j]);
			}	
		}
//		System.out.println(arr[i]);
	}

}
}
