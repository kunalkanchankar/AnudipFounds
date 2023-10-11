package day1010;


public class ParameterExample {
    public double calculatePerimeter(int side) {
        return 4 * side;
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public double calculatePerimeter(double radius) {
        return 2 * 3.142 * radius;
    }

    public static void main(String[] args) {
        ParameterExample obj = new ParameterExample();

        double squarePerimeter = obj.calculatePerimeter(5);
        System.out.println("Perimeter of the square: " + squarePerimeter);

        double rectanglePerimeter = obj.calculatePerimeter(4, 6);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

        double circlePerimeter = obj.calculatePerimeter(3);
        System.out.println("Perimeter of the circle: " + circlePerimeter);
    }
}
