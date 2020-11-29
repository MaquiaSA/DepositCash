package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerTransactionTest {
    @Test
    void deposit_less_than_30000_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 5000;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaxDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_equal_to_30000_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 30000;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaxDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_more_than_30000_Result_Should_Be_False(){
        boolean expectedResult = false;
        float depositCash = 32000;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaxDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }
}
