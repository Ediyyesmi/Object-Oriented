/* - the employee constructor include 4 parametres: name, salary, work hours, hire year
   - %3 of tax on a salary that is more than 1000
   - that he gets 30tl for an additional hour
   - if he worked less than 5 years the raise of salary will be %5 */

import java.util.Scanner;

class Employee{
    private String name;
    public float salary;
    private int workhours, hireyear;

    Employee(String name,float salary,int workhours, int hireyear){
        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
        this.hireyear=hireyear;
    }

    public float tax(){
        if(this.salary>=1000){
            return salary*0.03f;
        }

        return 0.0f;
    }

    public float bonus(){
        int extrahours = this.workhours - 45;
        if (extrahours > 0) {
            return 30 * extrahours;
        }
        return 0.0f;
    }

    public float increase(){
        if(this.hireyear<2020){
            return salary*0.5f;
        }
        return 0;
    }

}



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee emp1 = new Employee ("abc", 2000, 50, 1985);
        System.out.println("tax: "+ emp1.tax());
        System.out.println("bonus: "+emp1.bonus());
        System.out.println("increase: "+emp1.increase());
        float totalsalary = emp1.salary - emp1.tax() + emp1.bonus() + emp1.increase();
        System.out.println("salary: "+totalsalary);

    }
}
