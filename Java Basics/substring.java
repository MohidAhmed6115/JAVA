import java.util.Scanner;
public class substring {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = in.nextLine();

        while(!email.contains("@")) {
            System.out.print("Invalid email! Please enter a correct mail: ");
            email = in.nextLine();
        }

        int n1 = email.indexOf('@');
        String username = email.substring(0, n1);
        String domain = email.substring(n1 + 1);

        System.out.println("Email    : " + email);
        System.out.println("Username : " + username);
        System.out.println("Domain   : " + domain);
    }
}
