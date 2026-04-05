import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = 0, width = 0, area = 0;

        System.out.print("Enter the height of the rectangle: ");
        height = in.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = in.nextDouble();

        area = width * height;

        System.out.print("The area of the rectangle is: " + area + "cm²");
        in.close();
    }
}