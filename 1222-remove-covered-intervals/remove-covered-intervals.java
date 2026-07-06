class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        int res=0,r=0;
        for(int[]row:intervals){
            if(row[1]>r){
                r=row[1];
                res++;
            }
        }
        return res;
    }
}