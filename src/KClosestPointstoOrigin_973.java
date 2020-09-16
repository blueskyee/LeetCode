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
        //solution1: use build-in sort function
        /*Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
        return Arrays.copyOfRange(points, 0, K);*/

        //solution2: base on quicksort
        int l = 0, r = points.length-1;
        int mid = 0;
        while (l <= r){
            mid = quickSortOne(points, l, r);
            if(mid == K){
                break;
            }else if(mid < K){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return Arrays.copyOfRange(points, 0, K);
    }

    private int quickSortOne(int[][] points, int l, int r){
        int idx = l-1;
        for(int i=l; i<r; i++){
            if(comapre(points[i], points[r]) < 0){
                idx++;
                swap(points, idx, i);
            }
        }
        swap(points, idx+1, r);

        return idx+1;
    }

    private int comapre(int[] p1, int[] p2){
        return p1[0]*p1[0] + p1[1]*p1[1] - p2[0]*p2[0] - p2[1]*p2[1];
    }

    static final private void swap(int[][] point, int p1, int p2){
        int[] temp = point[p1];
        point[p1] = point[p2];
        point[p2] = temp;
    }

}
