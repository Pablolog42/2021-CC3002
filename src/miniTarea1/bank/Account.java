package src.miniTarea1.bank;

/**
 * @author Pablo Gonzalez Aguilera.
 * CC3002-1
 * MiniTarea 1
 **/


/**
 * Class Account - Denotes a bank account of a person. to be used in the class Bank.
 **/
public class Account {
    private final String accountName;
    private int balance;
    private int numberOfTransactions;

    /**
     * Account Class constructor.
     * Every account has: name, balance, no. of Transactions.
     */
    public Account(String anAccountName){
        accountName = anAccountName;
        balance = 0;
        numberOfTransactions = 0;
    }

    /**
     * Class constructor, specifiying an initial balance and no. of transactions.
     */
    public Account(String anAccountName, int aBalance, int aNumberOfTransactions){
        accountName = anAccountName;
        balance = aBalance;
        numberOfTransactions = aNumberOfTransactions;
    }


    /** Draws (removes) an amount of money from the account.
     * note: negative balances (debt) are allowed.
     * @param moneyToDraw an integer that denotes how much money to draw from the account.
     */
    public void drawMoney(int moneyToDraw){
        this.balance -= moneyToDraw;
        this.numberOfTransactions += 1;
    }

    /** Deposits (adds) an amount of monet from the account.
     * @param moneyToDeposit an integer that denotes how much money to draw from the account.
     */
    public void depositMoney(int moneyToDeposit){
        this.balance += moneyToDeposit;
        this.numberOfTransactions += 1;
    }

    /** Gets the current Accounts’s numberOfTransactions. **/
    public int getNumberOfTransactions(){
        return this.numberOfTransactions;
    }

    /** Gets the current Accounts’s balance. **/
    public int getBalance() {
        return  this.balance;
    }
}
