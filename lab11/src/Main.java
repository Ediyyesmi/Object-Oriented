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