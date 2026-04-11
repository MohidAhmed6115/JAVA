import java.util.Scanner;
public class enhanced_switches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day = in.nextLine();

        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("It is a weekday!");
            case "Saturday", "Sunday" ->
                System.out.println("It is a weekend!");
            default -> System.out.println(day + " is not a day!");
        }

        in.close();
    }
}