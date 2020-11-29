package th.ac.ku;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;

public class Agent {
    public boolean checkMaxDepositPerTransaction(float amount) {
        return amount <= getMaxDepositPerTransactionLimit();
    }

    private float getMaxDepositPerTransactionLimit() {
        return 30000.00f;
    }

    public boolean checkMaxDepositPerDay(float amount) {
        return amount <= getMaxDepositPerDayLimit();
    }

    private float getMaxDepositPerDayLimit() {
        return 50000.00f;
    }

    public boolean checkValidAccount(String accountNumber) {
        return getAllAccountNumberList().contains(accountNumber) && !getInvalidAccountNumberList().contains(accountNumber);
    }

    private List<String> getAllAccountNumberList() {
        String[] accountList = {"7894560123","0123456789","9876543210"};
        return Arrays.asList(accountList);
    }

    private List<String> getInvalidAccountNumberList() {
        String[] invalidAccountList = {"0123456789","9876543210"};
        return Arrays.asList(invalidAccountList);
    }

    public boolean checkMinDepositPerTransaction(String accountType, float amount) {
        return amount >= getMinDepositPerTransactionLimit(accountType);
    }

    private float getMinDepositPerTransactionLimit(String accountType) {
        return 100.00f;
    }
}
