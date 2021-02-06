import java.util.Arrays;

/**
 * Created by henry on 2021/2/7.
 */
public class NonoverlappingIntervals_435 {
    public static void main(String[] args){
        int[][] intervals = {{1,2},{1,2},{1,2}};
        NonoverlappingIntervals_435 ni = new NonoverlappingIntervals_435();
        System.out.println(ni.eraseOverlapIntervals(intervals));
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        //find the max non-overlap intervals
        if(intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 1;
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= end){
                end = intervals[i][1];
                count++;
            }
        }
        return intervals.length - count;
    }
}
