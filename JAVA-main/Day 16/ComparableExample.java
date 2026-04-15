import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s){
        return this.mark-s.mark;
    }
    @Override
    public String toString(){
        return name+"-"+mark;
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ABC",70));
        students.add(new Student("DEF",65));
        students.add(new Student("XYZ",87));
        students.add(new Student("PQR",99));
        Collections.sort(students);
        System.out.print(students);
    }
}
