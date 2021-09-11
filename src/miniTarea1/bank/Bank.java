package src.miniTarea1.bank;
import java.util.Hashtable;

/*
  @author Pablo Gonzalez Aguilera.
 * CC3002-1
 * MiniTarea 1
 */


/**
 * Class Bank - Denotes a bank with multiple accounts aranged onto a hashTable.
 **/
public class Bank {

    // Creates the bank's hashtable
    private final Hashtable<String, Account> accounts = new Hashtable<String, Account>();

    /**
     * Empty Bank Class constructor (uses default object constructor).
     */
    public Bank(){
    }

    /** Deposits (adds) money into a specific account. In case the account doesn't exist,
     * the method creates a new account and adds the corresponding balence to it.
     *
     * @param anAccountName The name (string) of the account to add.
     * @param aMoneyToDeposit The integer denoting how much money to add.
     */
    public void deposite(String anAccountName, int aMoneyToDeposit) {
        // Case no account in bank
        if (!this.hasAccount(anAccountName)){
            this.addAccount(anAccountName);
        }
        // deposit money to acc in hashtable
        this.accounts.get(anAccountName).depositMoney(aMoneyToDeposit);
    }

    /** Adds an account entry to the bank's account hashtable.
     * the entry is in the form: AccountIdentifier (name) - AccountObject
     * Note: the method doesn't check if another account of  the same name (id) exists,
     * in case there are multiple people with the same name.
     *
     * @param anAccountName The name of the account to add.
     */
    public void addAccount(String anAccountName){
        this.accounts.put(anAccountName, new Account(anAccountName));
    }

    /** checks if an account with a given name exists in the bank's account hash table.
     * Returns True if it already exissts; False otherwise.
     * @param anAccountName The name (string) of the account to check for.
     */
    public boolean hasAccount(String anAccountName) {
        return this.accounts.containsKey(anAccountName);
    }

    /**Gets the total number of transactions of a specific account in the bank's account hash table.
     * @param anAccountName The name (string) of the account to check for.
     */
    public int numberOfTransactions(String anAccountName) {
        return this.accounts.get(anAccountName).getNumberOfTransactions();
    }

    /**Gets the balance of a specific account in the bank's account hash table
     * @param anAccountName The name (string) of the account to check for.
     */
    public int balance(String anAccountName) {
        return this.accounts.get(anAccountName).getBalance();
    }
}

