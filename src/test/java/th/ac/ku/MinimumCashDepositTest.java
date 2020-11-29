package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCashDepositTest {
    @Test
    void deposit_less_than_100_Result_Should_Be_False(){
        boolean expectedResult = false;
        float depositCash = 50.00f;
        String accountType = "Savings";
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinDepositPerTransaction(accountType, depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_equal_to_100_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 100.00f;
        String accountType = "Savings";
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinDepositPerTransaction(accountType, depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_more_than_100_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 300.00f;
        String accountType = "Savings";
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinDepositPerTransaction(accountType, depositCash);

        assertEquals(expectedResult, actualResult);
    }
}
