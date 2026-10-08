import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        int i = 0;

        while (i < intervals.length && intervals[i][1] < newInterval[0]) {

            matrix.add(new ArrayList<>(
                    Arrays.asList(intervals[i][0], intervals[i][1])));
            i++;
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;

        }

        matrix.add(new ArrayList<>(Arrays.asList(
                newInterval[0],
                newInterval[1])));

        while (i < intervals.length) {
            matrix.add(new ArrayList<>(
                    Arrays.asList(intervals[i][0], intervals[i][1])));
            i++;
        }

        int[][] result = new int[matrix.size()][2];

        for (int j = 0; j < matrix.size(); j++) {
            result[j][0] = matrix.get(j).get(0);
            result[j][1] = matrix.get(j).get(1);
        }

        return result;
    }
}