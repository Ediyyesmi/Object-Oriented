public class FullTimeEmp extends Employee implements Salary{
    public FullTimeEmp(String name, double wage) {
        super(name, wage);
    }

    public double calculateSalary(){
        return wage*40;
    }
}