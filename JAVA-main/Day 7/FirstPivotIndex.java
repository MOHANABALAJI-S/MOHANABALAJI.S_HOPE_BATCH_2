class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        int rSum = totalSum;
        int lSum = 0;

        for(int i = 0; i < nums.length; i++){

            rSum -= nums[i];

            if(rSum == lSum){
                return i;
            }

            lSum += nums[i];
        }

        return -1;
    }
}