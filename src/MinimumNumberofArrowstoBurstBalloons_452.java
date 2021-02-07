import java.util.Arrays;

/**
 * Created by henry on 2021/2/7.
 */
public class MinimumNumberofArrowstoBurstBalloons_452 {

    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length == 0) return 0;

        //sort by start of each point
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));

        //find the max non-overlap points
        int end = points[0][1];
        int count = 1;
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > end){
                end = points[i][1];
                count++;
            }
        }

        return count;
    }
}
