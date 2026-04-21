import java.util.function.Predicate;
class Student{
    int mark;
    Student(int mark){
        this.mark=mark;
    }
}
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n)->n%2==0;
        Predicate<Integer> isOdd = isEven.negate();
        Predicate<Student> isPass = (s)->s.mark>40;
        //new Predicate<Integer>(){
        //    public boolean test(Integer n){
        //        return n%2==0;
        //    }
        //};
        System.out.println(isEven.test(4));
        System.out.println(isPass.test(new Student(45)));
        System.out.println(isOdd.test(4));
    }
}
