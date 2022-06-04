import CompoundInterestCalculator.CompoundInterest;
<<<<<<< HEAD
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class CompoundInterestTest {
    public CompoundInterest calculator;
    @BeforeEach
    public void setUp(){
        calculator = new CompoundInterest();
    }

    @Test
    public void Test_Compound_Interest_Can_Be_Created(){
        CompoundInterest calculator = new CompoundInterest();
        assertNotNull(calculator);
    }
    @Test
    public void Test_Compound_Interest_Parameter_Can_Be_Created(){
        calculator.FinalAmount(1.0);
        calculator.Principal(1);
        calculator.InterestRate(1);
        calculator.NumberOfTimeInterestApplied(1);
        calculator.Time(1);
        assertEquals(1, calculator.getFinalAmount());
        assertEquals(1, calculator.getPrincipal());
        assertEquals(1, calculator.getInterestRate());
        assertEquals(1, calculator.getNumberOfTimeInterestApplied());
        assertEquals(1, calculator.getTime());

    }

=======
import org.testng.annotations.Test;

public class CompoundInterestTest {
    @Test
    public void Test_Compound_Interest_Can_Be_Created(){
        CompoundInterest calculator = new CompoundInterest();
    }
>>>>>>> origin/main
}

