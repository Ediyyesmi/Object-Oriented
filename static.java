//use static keyword

public class Student{
    public String name;
    public int number;
    private static int counter=0;

    Student(String name, int number){
        this.name=name;
        this.number=number;
        Student.counter++;
    }

    public static int how(){
        return Student.counter;
    }

    public void exit(){
        Student.counter--;
    }

    public static void main(String[] args){
        Student s1 = new Student("Seyyide", 100);
        System.out.println("number of student: "+Student.how());
        Student s2 = new Student("Nur", 97);
        System.out.println("number of student: "+Student.how());
        s1.exit();
        System.out.println("number of student :"+Student.how());

    }
}
