
import java.util.Random;

public class random {

    public static void main(String[] args) {
        Random random = new Random();
        int number;
        double price;
        boolean isHeads;

        number = random.nextInt(1, 100);
        price = random.nextDouble(1, 10);
        isHeads = random.nextBoolean();

        System.out.println("Random number between 1 and 100: " + number);
        System.out.println("The discounted price is: " + price);
        System.out.println(isHeads ? "Heads!" : "Tails!");
    }
}
