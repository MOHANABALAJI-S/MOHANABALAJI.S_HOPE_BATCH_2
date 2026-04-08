import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> Linkedset = new LinkedHashSet<>();
        Set<Integer> HSet =  new HashSet<>();
        int[] arr = {1,23,5,75,9,4,12};
        for(int i:arr){
            Linkedset.add(i);
            HSet.add(i);
        }
        System.out.println(Linkedset);
        System.out.println(HSet);

    }
}
