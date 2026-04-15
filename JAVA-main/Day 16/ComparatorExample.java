import java.util.*;
class Student{
    int id;
    String name;
    int mark;
    Student(int id,String name,int mark){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    @Override
    public String toString(){
        return id+"-"+name+"-"+mark;
    }
}
public class ComparatorExample{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(6,"ABC",70));
        students.add(new Student(10,"DEF",80));
        students.add(new Student(15,"XYZ",34));
        students.add(new Student(12,"PQR",56));
        students.add(new Student(2,"EFG",98));
        Comparator<Student> byId = new Comparator<Student>(){
            public int compare(Student a,Student b){
                return a.id-b.id;
            }
        };
        Collections.sort(students,byId);
        System.out.println(students);
    }
}