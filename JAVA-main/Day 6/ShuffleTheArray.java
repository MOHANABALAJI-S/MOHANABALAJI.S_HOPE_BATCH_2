
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size=nums.length;
        int i=0,j=n;
        int k=0;
        int[] arr = new int[nums.length];
        while(j<size){
            arr[k]=nums[i];
            arr[k+1]=nums[j];
            i++;
            j++;
            k+=2;
        }
        return arr;
    }
}