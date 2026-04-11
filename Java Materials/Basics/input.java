import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt(). It must be used after nextInt(), nextDouble()...
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello, " + name + "!");
        System.out.println("You are now " + age + " years old!");
        System.out.println("Your GPA is " + gpa + "!");
        System.out.println(isStudent ? "You are a student!" : "You are NOT a student!");

        scanner.close();
    }
}