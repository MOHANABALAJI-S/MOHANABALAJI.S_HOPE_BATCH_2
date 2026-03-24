class Solution {
    public int arraySign(int[] nums) {
        int sign=1,nc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
            nc+=1;
            else if(nums[i]==0)
            sign=0;
        }
        if(nc%2!=0)
        sign=-sign;
    return sign;
    }
}
        