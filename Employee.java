import java.util.Scanner;

public class Employee {
    String name;
    int securityNumber;
    float wage;
    int workingHours;

    void displayInfo(){
        System.out.println("name: "+name+" -"+"security number: "+securityNumber);
    }

    void displaySalary(){
        System.out.println("salary: "+wage*workingHours);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee();

        System.out.println("enter your name: ");
        e1.name=input.next();

        System.out.println("enter your security number: ");
        e1.securityNumber=input.nextInt();

        System.out.println("enter your working hours: ");
        e1.workingHours=input.nextInt();

        System.out.println("enter your wage: ");
        e1.wage=input.nextFloat();

        e1.displayInfo();
        e1.displaySalary();
    }


}
