package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAccountTest {

    @Test
    void valid_account_result_should_be_True(){
        boolean expectedResult = true;
        String accountNumber = "7894560123";
        Agent agent = new Agent();

        boolean actualResult = agent.checkValidAccount(accountNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void invalid_account_result_should_be_False(){
        boolean expectedResult = false;
        String accountNumber = "0123456789";
        Agent agent = new Agent();

        boolean actualResult = agent.checkValidAccount(accountNumber);

        assertEquals(expectedResult, actualResult);
    }
}
