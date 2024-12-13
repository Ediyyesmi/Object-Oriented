public class PartTimeEmp extends Employee implements Salary{
    private int hours;

    public PartTimeEmp(String name, double wage, int hours) {
        super(name, wage);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public double calculateSalary(){
        return wage*hours;
    }
}