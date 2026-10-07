class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, Comparator.comparingDouble(o->o[1]));

        int end = intervals[0][1];

        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] < end){
                count++;
            } else{
                end = intervals[i][1];
            }
        }
        return count;
    }
}