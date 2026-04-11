import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // try {
        //     // ArithmeticException
        //     System.out.println(1 / 0);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("You CAAAAANNT divide by ZERO!");
        // }

        // this is try with resources
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = in.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number!");
        }
        catch(ArithmeticException e){
            System.out.println("You CAAAAANNT divide by ZERO!");
        }
        catch(Exception e){
            // catches all exceptions -> Safety Net
            System.out.println("Something went wrong!");
        }
        finally{
            // in.close();
            // Scanner is automatically closed
            System.out.println("This always Executes!");
        }

    }
}