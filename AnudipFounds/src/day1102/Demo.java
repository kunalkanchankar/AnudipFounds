package day1102;

//class Demo {
//
//public static void main(String s[]) {
//
//try {
//
//for(int i=0;i<5;++i) {
//
//System.out.println(s[i]);
//
//}
//
//}
//
//catch(ArrayIndexOutOfBoundsException e) {
//
//System.out.println("Exception Generated:"+e);
//
//}
//
//finally
//
//{}
//
//}
//
//}



class Demo

{

public static void main(String[] args) {

int k = 0;

try {

int i = 5/k;

}

catch(ArithmeticException e) {

System.out.println("1");

}

catch(RuntimeException e) {

System.out.println("2");

}

catch(Exception e) {

System.out.println("3");

}

finally {

System.out.println("4");

}

System.out.println("5");

}

}



//
//
//class Demo
//
//{
//
//public void arr()
//
//{
//
//try
//
//{
//
//int y[] = { 2 , 7, 8 , 6};
//
//for (int j=0; j< y.length; )
//
//{
//
//j++;
//
//y[j] = y[j-1];
//
//System.out.print(y[j] + "");
//
//}}catch(IndexOutOfBoundsException ie)
//
//{
//
//ie.printStackTrace();
//
//}
//
//catch(Exception e) {
//
//e.printStackTrace();
//
//}
//
//}
//
//public static void main (String args[])
//
//{
//
//Demo demo=new Demo();
//demo.arr();
//
//}
//
//}