package day1509;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three angles (in degrees): ");
        double angle1 = scanner.nextDouble();
        double angle2 = scanner.nextDouble();
        double angle3 = scanner.nextDouble();

        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("These angle is acute triangle");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("These angles is obtuse triangle");
            } else {
                System.out.println("These angle is neither acute nor obtuse triangle");
            }
        } else {
            System.out.println("valid triangle.");
        }
    }
}
