import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Compound Interest Calculator
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        double interestEarned;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+ rate / timesCompounded, timesCompounded * years);

        interestEarned = amount - principal;

        System.out.printf("\nThe amount after %d years is: $%.2f", years, amount);
        System.out.printf("\nTotal interest earned: $%.2f\n", interestEarned);



        scanner.close();


    }
}