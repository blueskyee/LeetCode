import java.util.Arrays;

/**
 * Created by henry on 2020/9/16.
 */
public class KClosestPointstoOrigin_973 {
    public static void main(String[] args){
        int[][] points = {{3,3},{5,-1},{-2,4}};

        KClosestPointstoOrigin_973 kp = new KClosestPointstoOrigin_973();
        System.out.println(kp.kClosest(points, 2));
    }

    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
        return Arrays.copyOfRange(points, 0, K);
    }

}
