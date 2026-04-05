import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference of the Circle: %.1fcm\n", circumference);
        System.out.printf("Area of the Circle         : %.1fcm²\n", area);
        System.out.printf("Volume of the Circle       : %.1fcm³\n", volume);
        scanner.close();
    }
}