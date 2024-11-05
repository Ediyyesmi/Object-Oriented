import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("enter integer value: ");
            int sayi1= input.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("finish");
    }



}
