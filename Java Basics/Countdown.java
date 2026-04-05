import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Countdown Timer(in seconds): ");
        int countdown = in.nextInt();

        System.out.println("Total Coundown Timer: " + countdown + " seconds");
        for (int i = 0; i <= countdown; i++)
        {
            System.out.print(i + " ");
            Thread.sleep(1000);
        }

        in.close();
    }
}