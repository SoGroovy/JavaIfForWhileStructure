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
        System.out.println("It will take " + done(loan, interestR, monthPay) + " month(s) to finish paying off the loan.");
    }

    public static double done(double loan, double interestR, double monthPay) {
//        double months = (loan/monthPay);
//        double interestaccrue = (loan)*(months * ((interestR/12)/100));
//        double finalAmount = interestaccrue + loan;
//        double monthsToFreedom = Math.ceil(finalAmount / monthPay);
//
//        return monthsToFreedom;
        double monthsToFreedom = 0;
        double finalAmount = loan;
        for(; finalAmount >= 0; ) {
            double interest = (interestR / 12) * finalAmount;
            finalAmount = finalAmount + interest - monthPay;
            monthsToFreedom++;
        }

        return monthsToFreedom;
    }
}
