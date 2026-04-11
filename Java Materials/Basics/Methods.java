import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = in.nextDouble();

        System.out.printf("Circumference:  %.2fcm\n", circumference(radius));
        System.out.printf("Area         :  %.2fcm²\n", area(radius));
        System.out.printf("Volume       :  %.2fcm3\n", volume(radius));

        in.close();
    }
    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
    static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
