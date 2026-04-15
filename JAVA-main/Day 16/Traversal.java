import java.util.*;
public class Traversal{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,5));
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            int curr = it.next();
            if(curr==4){
                it.remove();
            }
        }
        while(it.hasPrevious()){
            int prev = it.previous();
            System.out.print(prev);
        }
    }
}