public class Wrapper {
    public static int test(String s){
            return Integer.valueOf(s);
        }
    public static void main(String[] args) {
        Integer b = Integer.valueOf("0123456");//return type->object(Integer)
        Integer c = Integer.parseInt("0987");//return type-.int(int)
        int a = b.intValue();//unboxing
        Integer x =200;
        Integer y = 200;
        System.out.println(x==y);
        System.out.println(x.equals(y));

    }
}
