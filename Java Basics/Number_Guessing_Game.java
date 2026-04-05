import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(1, 101);
        int turns = 0;

        System.out.print("You have 5 attempts to guess the correct number! Enter your guess: ");
        int guess = in.nextInt();

        while(guess != number && turns != 5)
        {
            if(number > guess)
            {
                System.out.print("Too Low! Try another number: ");
                guess = in.nextInt();
            }
            else if(number < guess)
            {
                System.out.print("Too High! Try another number: ");
                guess = in.nextInt();
            }
            turns++;
        }

        if(guess == number)
        {
            System.out.println("Congratulations! You guessed the correct number");
        }
        else {
            System.out.println("You lost the game! Better Luck next Time!");
            System.out.println("The number was " + number);
        }
        System.out.println("Number of attempts: " + turns);
        
        in.close();
    }
}