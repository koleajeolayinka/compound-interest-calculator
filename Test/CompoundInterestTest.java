import CompoundInterestCalculator.CompoundInterest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CompoundInterestTest {
    public CompoundInterest calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CompoundInterest();
    }

    @Test
    public void Test_Compound_Interest_Can_Be_Created() {
        CompoundInterest calculator = new CompoundInterest();
        assertNotNull(calculator);
    }

    @Test
    public void Test_Compound_Interest_Parameter_Can_Be_Created() {
        calculator.FinalAmount(1.0);
        calculator.Principal(1);
        calculator.InterestRate(1);
        calculator.NumberOfTimeInterestApplied(1);
        calculator.Time(1);
        assertEquals(1, calculator.getFinalAmount());
        Assertions.assertEquals(1, calculator.getPrincipal());
        Assertions.assertEquals(1, calculator.getInterestRate());
        Assertions.assertEquals(1, calculator.getNumberOfTimeInterestApplied());
        Assertions.assertEquals(1, calculator.getTime());

    }

    @Test
    public void Test_Final_Amount_For_Compound_Interest(){
        calculator.Principal(1);
        calculator.InterestRate(1);
        calculator.NumberOfTimeInterestApplied(1);
        calculator.Time(1);
        assertEquals(2, calculator.getA());
    }

    @Test
    public void Test_Principal_For_Compound_Interest(){
        calculator.FinalAmount(1);
        calculator.InterestRate(1);
        calculator.NumberOfTimeInterestApplied(1);
        calculator.Time(1);
        assertEquals(2, calculator.getP());


    }
    @Test
    public void Test_Interest_Rate_For_Compound_Interest(){
        calculator.FinalAmount(1);
        calculator.Principal(1);
        calculator.NumberOfTimeInterestApplied(1);
        calculator.Time(1);
        assertEquals(0, calculator.getR());

    }
    @Test
    public void Test_Interest_Amount_For_Compound_Interest(){
        calculator.Time(1);
        calculator.Principal(1);
        calculator.InterestRate(1);
        assertEquals(1, calculator.I());
    }
    @Test
    public void Test_Time_For_Compound_Interest() {
        calculator.Principal(1);
        calculator.InterestRate(1);
        assertEquals(0, calculator.T());
    }
    

}
