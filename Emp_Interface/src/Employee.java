public class Employee {
    protected String name;
    protected double wage;

    public Employee(String name, double wage){
        this.name=name;
        this.wage=wage;
    }

    public String getName(){
        return name;
    }

    public double getWage(){
        return wage;
    }
}
