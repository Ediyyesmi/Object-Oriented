/* Write a class called BankAccount. The class must have 3 attributes: accountNo(int),
holderName(String) and balance(double).
a) Class constructor will have to set these 3 attributes.
b) Create a balanceChange(double amount) method to reduce balance value by given amount.
c) In the Main method:
   1. Create 4 objects (a1, a2, a3, a4) from this class and add them all to an
   ArrayList called myAccounts. List will only accept BankAccount type.
   2. Sort objects by holderName in the list. (Hint: implement Comparable interface)
   3. Reduce the balances by 500 for all the accounts and print sorted objects in the list. */


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        BankAccount a1 = new BankAccount(101, "Seyyide", 2000);
        BankAccount a2 = new BankAccount(102, "Nur", 1500);
        BankAccount a3 = new BankAccount(103, "A", 1800);
        BankAccount a4 = new BankAccount(104, "B", 2200);

        ArrayList<BankAccount> myAccount = new ArrayList<>();
        myAccount.add(a1);
        myAccount.add(a2);
        myAccount.add(a3);
        myAccount.add(a4);

        Collections.sort(myAccount);

        for(BankAccount account : myAccount){
            account.balanceChance(500);
        }

        for(BankAccount account : myAccount){
            System.out.println(account);
        }

    }
}
