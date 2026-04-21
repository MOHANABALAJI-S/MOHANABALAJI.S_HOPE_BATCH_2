import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums1)
        map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> res = new ArrayList<>();
        for(int i:nums2){
            if(map.containsKey(i) && map.get(i)>0){
                res.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++)
        ans[i]=res.get(i);
        return ans;
    }
} 
