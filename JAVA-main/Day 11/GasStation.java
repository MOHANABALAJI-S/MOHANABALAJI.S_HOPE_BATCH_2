class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,totalcost=0;
        int total=0,start=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            total+=gas[i]-cost[i];
            if(total<0){
                start=i+1;
                total=0;
            }
        }
        if(totalgas>=totalcost){
            return start;
        }
        return -1;
    }
}