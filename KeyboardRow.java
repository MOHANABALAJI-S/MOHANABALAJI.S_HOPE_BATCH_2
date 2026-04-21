import java.util.function.Consumer;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class ConsumerExample {
    public static void main(String[] args) {
    Consumer<String> printString=(s)->System.out.println(s);
    Consumer<Student> printName=(s)->System.out.println(s.name);
    printName.accept(new Student("test1"));
    printString.accept("from consumer");
    List<String> names = List.of("abc","def","ghi");
    names.forEach(name->System.out.println);
}
}
