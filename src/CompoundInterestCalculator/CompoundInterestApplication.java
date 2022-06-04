package CompoundInterestCalculator;

import java.security.Principal;
import java.util.InputMismatchException;
import java.util.Scanner;
//P (1 + R/n) (nt) - P

//        Here P is principal amount.
//        R is the annual interest rate.
//        t is the time the money is invested or borrowed for.
//        n is the number of times that interest is compounded per unit t, for example if interest is compounded monthly and t is in years then the value of n would be 12. If interest is compounded quarterly and t is in years then the value of n would be 4.
//
//        Before writing the java program let’s take an example to calculate the compound interest.
//
//        Let’s say an amount of $2,000 is deposited into a bank account as a fixed deposit at an annual interest rate of 8%, compounded monthly, the compound interest after 5 years would be:
//
//        P = 2000.
//        R = 8/100 = 0.08 (decimal).
//        n = 12.
//        t = 5.

//A	=	final amount
//        P	=	initial principal balance
//        r	=	interest rate
//        n	=	number of times interest applied per time period
//        t	=	number of time periods elapsed
public class CompoundInterestApplication {
    public static Scanner scanner = new Scanner(System.in);
    public static CompoundInterest calculator = new CompoundInterest();

    public static double principalBalance;
    public static double interestRate;
    public static double number;
    public static double time;
    public static void main(String[] args) {
        System.out.println("WELCOME TO COMPOUND INTEREST CALCULATOR APPLICATION");
        RunCompoundInterestCalculator();
    }

    private static void RunCompoundInterestCalculator() {
        System.out.println("""
                PRESS 1 -> COMPOUND INTEREST  (A)
                PRESS 2 -> PRINCIPAL BALANCE OF THE COMPOUND INTEREST (P)
                PRESS 3 -> INTEREST RATE OF THE COMPOUND INTEREST (R)
                PRESS 4 -> NUMBER OF TIMES INTEREST APPLIED PER TIME PERIOD
                PRESS 5 -> NUMBER OF TIME PERIODS ELAPSED
                """);
        String UserInput = scanner.nextLine();

        switch (UserInput) {
            case "1" -> compoundInterest();
            case "2" -> principalBalance();
            case "3" -> interestRate();
            case "4" -> numberOfTimesInterestApplied();
            case "5" -> TimePeriodsElapse();
            default -> Other();
        }
    }

    private static void Other() {
        System.out.println("INCORRECT INPUT KINDLY TRY AGAIN");
        RunCompoundInterestCalculator();

    }

    private static void TimePeriodsElapse() {
    }

    private static void numberOfTimesInterestApplied() {
    }

    private static void interestRate() {
    }

    private static void principalBalance() {

    }

    private static void compoundInterest() {
        try {
            System.out.println("KINDLY ENTER YOUR PRINCIPAL BALANCE");
            principalBalance = scanner.nextDouble();
            System.out.println("KINDLY ENTER YOUR INTEREST RATE");
            interestRate = scanner.nextDouble();
            System.out.println("ENTER NUMBER OF TIMES INTEREST APPLIED PER TIME PERIOD");
            number = scanner.nextDouble();
            System.out.println("ENTER NUMBER OF TIME PERIODS ELAPSED");
            time = scanner.nextDouble();
        }catch (InputMismatchException ignored){
            System.out.println("Incorrect input");
        }
        calculator.Principal(principalBalance);
        calculator.InterestRate(interestRate);
        calculator.NumberOfTimeInterestApplied(number);
        calculator.Time(time);
        AmountResult();

    }

    private static void AmountResult() {
        for (int i = 0; i < 40; i++) {
            System.out.print("=");
        }
        System.out.printf("");
    }
}
