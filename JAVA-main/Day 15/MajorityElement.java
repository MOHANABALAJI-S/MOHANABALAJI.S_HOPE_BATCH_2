import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>(n/2))
                return nums[i];
        }
        return -1;
    }
}        