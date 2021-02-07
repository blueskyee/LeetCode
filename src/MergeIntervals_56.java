import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by henry on 2021/2/7.
 */
public class MergeIntervals_56 {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1) return intervals;

        //sort by start of each interval
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        //compare end of each interval against start of current interval to merge
        int[] curInterval = intervals[0];
        List<int[]> res = new ArrayList<>();
        res.add(curInterval);
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= curInterval[1]){
                curInterval[1] = Math.max(curInterval[1], intervals[i][1]);
            }else{
                curInterval = intervals[i];
                res.add(curInterval);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
