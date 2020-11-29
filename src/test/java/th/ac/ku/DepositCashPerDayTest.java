package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerDayTest {
    @Test
    void deposit_less_than_50000_per_day_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 25000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaxDepositPerDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_equal_to_50000_per_day_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 50000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaxDepositPerDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_more_than_50000_per_day_Result_Should_Be_False(){
        boolean expectedResult = false;
        float depositCash = 75000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaxDepositPerDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }
}
