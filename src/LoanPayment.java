import java.util.Scanner;

public class LoanPayment {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the loan amount: ");
        double loan = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the interest rate: ");
        double interestR = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the payment due each month: ");
        double monthPay = scanner3.nextDouble();

        System.out.println();
        System.out.println("The loan amount due is $" + loan);
        System.out.println("The interest rate is " + interestR + "%");
        System.out.println("The payment due each month is $" + monthPay);
        System.out.println("It will take " + done(loan, interestR, monthPay) + "(s) to finish paying off the loan.");
    }

    public static double done(double a, double b, double c) {
        double months = (a/c);
        double interestaccrue = (a)*(months * ((b/12)/100));
        double finalAmount = interestaccrue + a;
        double monthsToFreedom = Math.ceil(finalAmount / c);

        return monthsToFreedom;
    }
}
