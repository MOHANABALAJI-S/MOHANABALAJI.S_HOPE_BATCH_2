import java.util.*;
class Solution {
    public boolean ContainsDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(!set.add(n))
            return true;
        set.add(n);
        }
        return false;
    }
}