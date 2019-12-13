//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//*******************************************************

public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  private static int numAccounts;

  private static int numDeposits;
  private static int totalDeposits;
  private static int numWithdrawals;
  private static int totalWithdrawals;


  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
    numAccounts ++;
  }
  public Account (double initBal, String owner) {
    balance = initBal;
    name = owner;
    acctNum = Math.round( 999999 * Math.random());
    numAccounts ++;
  }
  public Account (String owner) {
    balance = 0;
    name = owner;
    acctNum = Math.round( 999999 * Math.random());
    numAccounts ++;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount){
      numWithdrawals++;
      totalWithdrawals += amount;
      balance -= amount;
    }
    else
       System.out.println("Insufficient funds");
  }
  public void withdraw(double amount, double fee)
  {
    if (balance >= amount + fee) {
      numWithdrawals++;
      totalWithdrawals += amount;
      balance -= (amount + fee);
    }
    else
       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    numDeposits ++;
    totalDeposits += amount;
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
	return "Name:" + name + 
        "\nAccount Number: " + acctNum +
        "\nBalance: " + balance; 
  }
  public static int getNumAccounts() {
    return numAccounts;
  }
  public void close() {
    name = "CLOSED";
    balance = 0.0;
    numAccounts --;
  }
  public static Account Consolidate (Account acct1, Account acct2) {
    if (acct1.acctNum != acct2.acctNum) {
      if (acct1.name == acct2.name) {
        acct1.close();
        acct2.close();
        Account a = new Account(acct1.balance + acct2.balance, acct1.name);
        return a;
      } else {
        System.out.println("Conslidate failed, wrong account name");
        return null;
      }
    } else {
      System.out.println("Conslidate failed, same account number");
      return null;
    }
  }
  public static String getNumDeposits() {
    return numDeposits + "";
  }
  public static String getTotalDeposits() {
    return totalDeposits + "";
  }
  public static String getNumWithdrawals() {
    return numWithdrawals + "";
  }
  public static String getTotalWithdrawals() {
    return totalWithdrawals + "";
  }
  public long getAcctNumber() {
	  return acctNum;
  }
}
