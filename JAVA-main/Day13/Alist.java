import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Alist {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,1,2,3,4,4,4,5,5,4};
        System.out.println(arr);
        ArrayList<Integer> list=new ArrayList<>((Arrays.asList(arr)));
        Collections.sort(list);
        int len=list.size();
        for(int i=0;i<len-1;i++){
            if(list.get(i)==list.get(i+1)){
                list.remove(i+1);
                i--;
                len--;
            }
        }
        System.out.println(list);
    }
}
