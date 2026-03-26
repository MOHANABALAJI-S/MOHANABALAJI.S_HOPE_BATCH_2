// class Sample{

//     int add(int a,int b){
//         return a+b;
//     }
//     int add(int a,int b,int c){
//         return a+b+c;
//     }
//     double add(double a,double b){
//         return a+b;
//     }

// }

public class App {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(double a,double b){
        return a+b;
    }
        public static void main(String[] args) {
        //Sample a=new Sample();
        System.out.println(add(5,6)+" "+add(34,6,7)+" "+add(7.6,34.6));
    }
}
