package CompoundInterestCalculator;

public class CompoundInterest {
    private double FinalAmount;
    private double Principal;
    private double InterestRate;
    private double NumberOfTimeInterestApplied;
    private double Time;

    public void Principal(double principal) {
        this.Principal = principal;
    }

    public void InterestRate(double InterestRate) {
        this.InterestRate = InterestRate;
    }

    public void NumberOfTimeInterestApplied(double number) {
        this.NumberOfTimeInterestApplied = number;
    }

    public void Time(double time) {
        this.Time = time;
    }

    public void FinalAmount(double amount) {
        this.FinalAmount = amount;
    }

    public double getFinalAmount() {
        return FinalAmount;

    }

    public double getPrincipal() {
        return Principal;

    }

    public double getInterestRate() {
        return InterestRate;
    }

    public double getNumberOfTimeInterestApplied() {
        return NumberOfTimeInterestApplied;
    }

    public double getTime() {
        return Time;
    }

    public double getA() {
        double cal0 = Principal * (1 + InterestRate/NumberOfTimeInterestApplied);
        double cal1 = NumberOfTimeInterestApplied * Time;
        return Math.pow(cal0, cal1);
    }
}