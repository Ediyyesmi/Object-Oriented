public class BankAccount implements Comparable<BankAccount> {
    private int accountNo;
    private String holderName;
    private double balance;

    public BankAccount (int accountNo, String holderName, double balance){
        this.accountNo=accountNo;
        this.balance=balance;
        this.holderName=holderName;
    }

    public int getAccountNo(){
        return accountNo;
    }

    public String getHolderName(){
        return holderName;
    }

    public double getBalance(){
        return balance;
    }

    public void balanceChance(double amount){
        this.balance -= amount;
    }

    @Override
    public int compareTo(BankAccount other){
        return this.holderName.compareTo(other.holderName);
    }

    @Override
    public String toString(){
        return "Account no: "+accountNo+", HolderName: "+holderName+", Balance: "+balance;
    }



}