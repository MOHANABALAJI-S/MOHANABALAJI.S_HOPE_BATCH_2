
public class Wrapper {
    public static void main(String[] args){
        Integer b=Integer.valueOf("200");//return type -> object()
        System.out.println(b);
        Integer x=200;
        System.out.println(x==b);
        System.out.println(b.equals(x));
        Integer c=Integer.parseInt("200");// return type -> int
        System.out.println(x==c);
        System.out.println(c);
    }
}
