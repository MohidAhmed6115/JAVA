import java.util.Arrays;
import java.util.Scanner;
public class CompleteArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String[] fruits = {"apple", "orange", "banana", "coconut"};
        // String [] fruits = new String[4];
        int size;
        String [] fruits;

        System.out.print("Enter no. of fruits: ");
        size = in.nextInt();
        in.nextLine();

        fruits = new String[size];

        for(int i = 0; i < fruits.length; i++)
        {
            System.out.print("Enter fruit no. " + (i+1) + ": ");
            fruits[i] = in.nextLine();
        }
        
        // all arrays methods
        // int numOfFruits = fruits.length;
        Arrays.sort(fruits);
        // Arrays.fill(fruits, "pineapple");

        // Enhanced for loop OR for each loop
        for(String fruit : fruits)
            System.out.println(fruit);

        in.close();
    } 
}