
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(" Press 1 for Dog\n Press 2 for Cat\nEnter here: ");
        int choice = in.nextInt();

        Animal animal = switch (choice) {
            case 1 ->
                new Dog();
            case 2 ->
                new Cat();
            default ->
                null;
        };

        animal.speak();

        in.close();
    }
}
