import java.util.*;
public class Intro {
    public static void main(String[] args) {
        //single threaded
        task1();
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("From task1:"+i);
        }
    }
    static void task2(){
        for(int i=0;i<5;i++){
            System.out.println("From task2:"+i);
        }
    }
}
