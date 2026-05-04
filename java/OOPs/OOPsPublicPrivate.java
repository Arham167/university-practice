class BankAccount {
    private int balance;

    public int deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("Deposited " + amount);
        return balance;
    }

    public int withdraw(int amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrew " + amount);
        }
        else
            System.out.println("You are broke");
        return balance;
    }

    public void getBalance()
    {
        System.out.println("Balance is: " + balance);
    }
}

public class OOPsPublicPrivate {
    public static void main(String args[])
    {
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.getBalance();
        myBankAccount.deposit(1000);
        myBankAccount.getBalance();
        myBankAccount.withdraw(5000);
        myBankAccount.withdraw(500);
        myBankAccount.getBalance();
    }
}