import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by blueskyee on 2016/2/14.
 */
public class MergeIntervals_8 {
    public static void main(String[] args) {
        Interval i1 = new Interval(1, 4);
        Interval i2 = new Interval(8, 10);
        ArrayList<Interval> intervalList = new ArrayList<Interval>();
        intervalList.add(i1);
        intervalList.add(i2);

        MergeIntervals_8 mt = new MergeIntervals_8();

        intervalList = mt.merge(intervalList);
        for (int i = 0; i < intervalList.size(); i++) {
            System.out.print(intervalList.get(i).start + "_"
                    + intervalList.get(i).end + ";");
        }
    }


    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        } else {
            Collections.sort(intervals, new IntervalComparator());

            ArrayList<Interval> rtnList = new ArrayList<Interval>();
            Interval preInterval = intervals.get(0);
            Interval currInterval = null;
            for (int i = 1; i < intervals.size(); i++) {
                currInterval = intervals.get(i);
                if (preInterval.end < currInterval.start) {
                    rtnList.add(preInterval);
                    preInterval = currInterval;
                } else {    //merge
                    currInterval.start = preInterval.start;
                    currInterval.end = currInterval.end > preInterval.end
                            ? currInterval.end : preInterval.end;
                    preInterval = currInterval;
                }
            }
            rtnList.add(preInterval);
            return rtnList;
        }
    }
}

    class Interval {
        int start ;
        int end;
        Interval () {
            start = 0;
            end = 0;
        }
        Interval(int s, int e) { start = s;
            end = e;
        }
    }

    class IntervalComparator implements Comparator<Interval>{
        public int compare(Interval i1, Interval i2){
            return i1.start - i2.start;
        }
    }

