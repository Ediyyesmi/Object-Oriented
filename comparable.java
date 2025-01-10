import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

  
  public int compareTo(Student st) {
        return this.age - st.age;
    }

  
    @Override
    public String toString() {
        return rollno + " " + name + " " + age;
    }
}

public class Main {
    public static void main(String args[]) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(101, "Vijay", 23));
        students.add(new Student(106, "Ajay", 27));
        students.add(new Student(105, "Jai", 21));

        
        Collections.sort(students);

        
        for (Student st : students) {
            System.out.println(st);
        }
    }
}
