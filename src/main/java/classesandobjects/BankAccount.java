package classesandobjects;

/**
 * Bank Account
 * 
 * <p>A bank manages customer accounts with careful tracking of ownership and balances.
 * Customers can deposit money to increase their balance and withdraw money to decrease it.
 * The bank ensures accounts never go negative (no overdrafts allowed).</p>
 * 
 * <p><b>Learning Focus:</b> Creating objects that maintain state (balance) and enforcing business rules
 * through methods that modify that state.</p>
 */
public class BankAccount {
    private final String owner;
    private double balance;

    /**
     * Opens a new bank account for a customer.
     * 
     * @param owner the name of the account owner
     * @param openingBalance the initial balance (in euros)
     */
    public BankAccount(String owner, double openingBalance) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Deposits money into the account.
     * 
     * @param amount the amount to deposit (in euros)
     * @return true if the deposit was successful, false otherwise
     */
    public boolean deposit(double amount) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Withdraws money from the account.
     * 
     * @param amount the amount to withdraw (in euros)
     * @return true if the withdrawal was successful, false if it would cause an overdraft
     */
    public boolean withdraw(double amount) {
        // prevent overdraft
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Gets the current balance.
     * 
     * @return the current balance in euros
     */
    public double getBalance() { return balance; }
} 