package CompoundInterestCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;
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
                PRESS 4 -> NUMBER OF TIME PERIODS ELAPSED
                """);
        String UserInput = scanner.nextLine();

        switch (UserInput) {
            case "1" -> compoundInterest();
            case "2" -> principalBalance();
            default -> Other();
        }
    }

    private static void Other() {
        System.out.println("INCORRECT INPUT KINDLY TRY AGAIN");
        RunCompoundInterestCalculator();

    }



    private static void principalBalance() {
        try {
            System.out.println("KINDLY ENTER YOUR FINAL AMOUNT BALANCE");
            principalBalance = scanner.nextDouble();
            System.out.println("KINDLY ENTER YOUR INTEREST RATE");
            interestRate = scanner.nextDouble();
            System.out.println("ENTER NUMBER OF TIMES INTEREST APPLIED PER TIME PERIOD");
            number = scanner.nextDouble();
            System.out.println("ENTER NUMBER OF TIME PERIODS ELAPSED IN YEAR\n\tex: 2years input 2");
            time = scanner.nextDouble();
        }catch (InputMismatchException ignored){
            System.out.println("Incorrect input");
        }
        calculator.Principal(principalBalance);
        calculator.InterestRate(interestRate);
        calculator.NumberOfTimeInterestApplied(number);
        calculator.Time(time);
        PrincipalResult();

    }

    private static void PrincipalResult() {
        line();
        System.out.printf("%n%s: %.2f%n", "PRINCIPAL ", calculator.getPrincipal());
        System.out.printf("%s: %.2f%n", "INTEREST RATE ", calculator.getInterestRate());
        System.out.printf("%s: %.2f%n", "NUMBER OF TIMES INTEREST APPLIED ", calculator.getNumberOfTimeInterestApplied());
        System.out.printf("%s: %.2f%n%35s%.2f%n", "TIME ", calculator.getTime(),"AMOUNT = ", calculator.getA());
        line();



    }

    private static void compoundInterest() {
        try {
            System.out.println("KINDLY ENTER YOUR PRINCIPAL BALANCE");
            principalBalance = scanner.nextDouble();
            System.out.println("KINDLY ENTER YOUR INTEREST RATE");
            interestRate = scanner.nextDouble();
            System.out.println("ENTER NUMBER OF TIMES INTEREST APPLIED PER TIME PERIOD");
            number = scanner.nextDouble();
            System.out.println("ENTER NUMBER OF TIME PERIODS ELAPSED IN YEAR\n\tex: 2years input 2");
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
        line();
        System.out.printf("%n%s: %.2f%n", "PRINCIPAL ", calculator.getPrincipal());
        System.out.printf("%s: %.2f%n", "INTEREST RATE ", calculator.getInterestRate());
        System.out.printf("%s: %.2f%n", "NUMBER OF TIMES INTEREST APPLIED ", calculator.getNumberOfTimeInterestApplied());
        System.out.printf("%s: %.2f%n%35s%.2f%n", "TIME ", calculator.getTime(), "AMOUNT = ", calculator.getA());
        line();
    }

    private static void line() {
        for (int i = 0; i < 40; i++) {
            System.out.print("=");

        }
    }

}


