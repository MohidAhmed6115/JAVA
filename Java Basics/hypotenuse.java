import java.util.Scanner;
public class hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double perpendicular, base, hypotenuse;
        System.out.print("Enter Base: ");
        base = scanner.nextDouble();
        System.out.print("Enter Perpendicular: ");
        perpendicular = scanner.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(perpendicular, 2) + Math.pow(base, 2));

        System.out.println("Hypotenuse = Perpendicular² + Base²");
        System.out.printf("Hypotenuse = (%.1f)² + (%.1f)²\n", perpendicular, base);
        System.out.println("Hypotenuse = " + hypotenuse + "cm");

        scanner.close();
    }
}