class Solution {
    public boolean canAliceWin(int[] nums) {
        int single_sum=0, double_sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                single_sum+=nums[i];
            }
            else{
                double_sum+=nums[i];
            }
        }
        if(single_sum==double_sum ){
            return false;
        }
        return true;
    }
}
