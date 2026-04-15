class Solution {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> byZeroIndex = new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[0],b[0]);
            }
        };
        Arrays.sort(intervals,byZeroIndex);
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int[] curr = intervals[i];
            if(res.isEmpty() || res.get(res.size()-1)[1]<curr[0]){
                res.add(curr);
            }
            else{
                int[] merge = res.get(res.size()-1);
                merge[1] = Math.max(merge[1],curr[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}