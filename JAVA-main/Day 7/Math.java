class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    double add(double a,double b){
        return a+b;
    }
}

public class Math {
    public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.add(10,20));  
    }
}
