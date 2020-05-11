import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by blueskyee on 2016/2/15.
 */
public class InsertInterval_9 {
    public static void main(String[] args) {
        Interval i1 = new Interval(1, 4);
        Interval i2 = new Interval(8, 10);
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(i1);
        intervals.add(i2);

        Interval newInterval = new Interval(3,6);
        InsertInterval_9 ii = new InsertInterval_9();
        try {
            intervals = ii.insert(intervals,newInterval);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < intervals.size(); i++) {
            System.out.print(intervals.get(i).start + "_"
                    + intervals.get(i).end + ";");
        }
    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals , Interval
            newInterval ) throws Exception{
        ArrayList<Interval> resultList = new ArrayList<Interval>();

        for(Interval interval:intervals){
            if(interval.end < newInterval.start){
                resultList.add(interval);
            }else if(interval.start > newInterval.end){
                resultList.add(newInterval);
                newInterval = interval;
            }else if(interval.end >= newInterval.start ||
                        interval.start <= newInterval.end){
                newInterval = new Interval(Math.min(interval.start,newInterval.start)
                                    ,Math.max(interval.end,newInterval.end));
            }
        }
        resultList.add(newInterval);
        return resultList;
    }
}