class Solution {
    public int minCostToMoveChips(int[] position) {
        int es=0,os=0,min;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0)
            es+=1;
            else
            os+=1;
        }
        min=Math.min(es,os);
        return min;

       
    }
}