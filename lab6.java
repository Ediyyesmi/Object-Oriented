public enum Days {
    monday,
    tuesday,
    wednesday,
    thursday,
    friday,
    saturday,
    sunday;
}


public class Employee {
    private String name;
    private Days[] workingDays;
    private static int employeeCount = 0;


    public Employee(String name, Days... workingDays) {
        this.name = name;
        this.workingDays = workingDays;
        employeeCount++;
    }

    public String getname(){
        return name;
    }

    public Days[] getWorkingDays() {
        return workingDays;
    }


    public void printWorkingDays() {
        System.out.print(name + " is working on: ");
        for (Days day : workingDays) {
            System.out.print(day + " ");
        }
        System.out.println();
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

}



public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("A",Days.monday, Days.thursday);
        Employee emp2 = new Employee("B",Days.tuesday, Days.thursday);
        Employee emp3 = new Employee("C",Days.friday, Days.thursday);


        emp1.printWorkingDays();
        emp2.printWorkingDays();
        emp3.printWorkingDays();

        System.out.println("Total number of employees: " + Employee.getEmployeeCount());
    }
}
