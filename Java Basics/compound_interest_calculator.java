
import java.util.Scanner;

public class compound_interest_calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double investment;
        double rate;
        int compoundTime;
        int years;
        double finalAmount;

        System.out.print("Enter your investment amount (in $) : ");
        investment = in.nextDouble();

        System.out.print("Enter the interest rate (in %) : ");
        rate = in.nextDouble() / 100;
        
        System.out.print("Enter amount of times interest is applied per year : ");
        compoundTime = in.nextInt();

        System.out.print("Enter total years : ");
        years = in.nextInt();

        // total = investment(1 + rate/compound)^(compound)(years)
        
        finalAmount = investment * Math.pow((1 + rate / compoundTime), compoundTime * years);
        
        System.out.printf("Total Amount after %d years is $%,.3f", years, finalAmount);

        in.close();
    }
}
