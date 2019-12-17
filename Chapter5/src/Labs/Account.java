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
  private static double totalDeposits;
  private static int numWithdrawals;
  private static double totalWithdrawals;


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
  public void transfer (Account acct, double amount) {
    if (getBalance() >= amount) {
      withdraw(amount);
      acct.deposit(amount);
      System.out.println(acct.toString());
      System.out.println(toString());
    } else {
      System.out.println("Insufficient funds");
    }
  }
  public static void transfer (Account from, Account to, double amount) {
    if (from.getBalance() >= amount) {
      from.withdraw(amount);
      to.deposit(amount);
      System.out.println(from.toString());
      System.out.println(to.toString());
    } else {
      System.out.println("Insufficient funds");
    }
  }
  public long getAcctNumber() {
	  return acctNum;
  }
  public static int getNumDeposits() {
	  return numDeposits;
  }
  public static int getNumWithdrawals() {
	  return numWithdrawals;
  }
  public static double getTotalDeposits() {
	  return totalDeposits;
  }
  public static double getTotalWithdrawals() {
	  return totalWithdrawals;
  }
  public static void reset() {
    numDeposits = 0;
    totalDeposits = 0;
    numWithdrawals = 0;
    totalWithdrawals = 0;
  }
}
