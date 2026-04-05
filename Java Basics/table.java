import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int table = in.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (i * table));
        }
        in.close();
    }
}