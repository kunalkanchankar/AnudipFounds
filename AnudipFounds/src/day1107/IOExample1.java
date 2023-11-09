package day1107;

import java.io.*;

import java.io.IOException;
import java.util.Scanner;

//public class IOExample1 {
//
//	public static void main(String[] args) throws IOException{
//	
//		try {
//			FileOutputStream obj=new FileOutputStream("demo.txt");
//			
////			String str = "Welcome to my world ";
////			byte b[] = str.getBytes();
////			obj.write(b);
//			
//			
//			obj.write(65);
//			obj.close();
//			System.out.println("Updated !");
//	
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		
//		}
//	}
//}
//


//public class IOExample1 {
//
//	public static void main(String[] args) throws IOException{
//	
//		try {
//			FileInputStream obj=new FileInputStream("demo.txt");
//			
//			int rad = obj.read();
//			System.out.println((char)rad);
//	
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		
//		}
//	}
//}
//
//import java.io.FileWriter;
//import java.io.IOException;

//public class IOExample1 {
//    public static void main(String[] args) {
//        String[] colors = { "Red","Green","Blue","Yellow","Orange"};
//        try {
//            FileWriter obj = new FileWriter("demo.txt");
//            for (String color : colors) {
//                obj.write(color + "  ");
//            }
//            obj.close();
//            System.out.println("Updated");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}


//public class IOExample1 {
//    public static void main(String[] args) {
//    	
//    	
//    	File obj=new File("demo.txt");
//    	Scanner sc;
//		try {
//			sc = new Scanner(obj);
//		
//    	String s;int count=0;
//    	while(sc.hasNextLine()) {
//    		count ++;
//	    	 s = sc.nextLine();
//	    	System.out.println(s);
//    	}
//    	System.out.println("Total lines are : "+count);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
//}

//public class IOExample1 {
//    public static void main(String[] args) {
//    	File obj=new File("demo.txt");
//    	Scanner sc;
//		try {
//			sc = new Scanner(obj);
//		
//    	String s;int count=0;
//    	while(sc.hasNextLine()) {
//    		 s = sc.nextLine();
//    		 
//    		 if(s.startsWith("T")) {
//    			 
//    		 }else {
//    		 count++;
//	    	System.out.println(s);
//    		 }
//    	}
//    	System.out.println("Total lines are : "+count);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//    }
//}

//public class IOExample1 {
//   public static void main(String[] args) throws Exception { 
//      File obj = new File ("demo.txt");
//      Scanner sc = new Scanner(obj);
//      int countw = 1;
//
//      while(sc.hasNextLine()){
//    	   String text = sc.nextLine();
//    	   countw+= text.split("\\s+").length;  
//    	}
//      System.out.println("Word count is " + countw);
//   }
//}



public class IOExample1 {
   public static void main(String[] args) throws Exception { 
      File obj = new File ("demo.txt");
      Scanner sc = new Scanner(obj);
      
      while(sc.hasNextLine()){
    	   String text = sc.nextLine();
    	   System.out.println(text.replace("j","i").replace("J","I"));
      }
   }
}

public class IOExample1 {
	   public static void main(String[] args) throws Exception { 
	      File obj = new File ("demo.txt");
	      Scanner sc = new Scanner(obj);
	      String str="";
	      while(sc.hasNextLine()){
	    	   String text = sc.nextLine();
	    	   str += text.replace("j","i").replace("J","I");
	    	   System.out.println(text.replace("j","i").replace("J","I"));
	      }
	      
	      FileOutputStream fobj=new FileOutputStream("demo.txt");
			
			byte b[] = str.getBytes();
			fobj.write(b);
			fobj.close();
			System.out.println("Updated !");
	   }
	}






