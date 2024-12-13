public class Main {
    public static void main(String[] args){
        FullTimeEmp full = new FullTimeEmp("Seyyide", 21);
        System.out.println("Full-time Employee: " + full.getName());
        System.out.println("Weekly Salary: " + full.calculateSalary());

        PartTimeEmp partTime = new PartTimeEmp("Nur", 20, 15);
        System.out.println("Part-time Employee: " + partTime.getName());
        System.out.println("Hourly Rate: $" + partTime.getWage());
        System.out.println("Total Hours: " + partTime.getHours());
        System.out.println("Weekly Salary: $" + partTime.calculateSalary());
    }
}
