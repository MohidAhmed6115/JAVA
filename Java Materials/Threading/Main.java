import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("You have 5 seconds to enter your name!");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");

        in.close();
    }
}