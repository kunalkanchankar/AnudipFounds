package day2809;

import java.util.Scanner;

class Rectangle{
	public 
		double width;
		double length;
	public Rectangle(double width, double length ) {
		this.width = width;
		this.length = length;
	}
	double area() {
		double area = 0;
		area =  width * length;
		return area;
	}
	double perimeter() {
		double peri = 0;
		peri = 2 * (width+length);
		return peri;
	}
}

public class PerimeterRectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter width : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter length : ");
        double num2 = scanner.nextDouble();

		
		Rectangle obj = new Rectangle(num1,num2);
		System.out.println("Area of Rectangle is :"+obj.area()+"cmsq");
		System.out.println("Perimeter of Rectangle is :"+obj.perimeter()+"cm");
		
	}

}
