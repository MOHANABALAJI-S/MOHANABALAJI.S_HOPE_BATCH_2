import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        int[] arr = {10,15,20,25,27,30};
        int target = 10;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        Integer lowest = set.lower(target);
        Integer highest = set.higher(target);
        if((target-lowest)>=(highest-target))
        System.out.println(highest);
        else    
        System.out.println(lowest);

    }
}
