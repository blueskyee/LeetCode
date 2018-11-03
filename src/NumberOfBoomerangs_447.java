import java.util.HashMap;

/**
 * Created by henry on 2018/11/3.
 */
public class NumberOfBoomerangs_447 {
    public static void main(String[] args){
        int[][] points = {{0,0},{1,0},{2,0}};
        NumberOfBoomerangs_447 nob = new NumberOfBoomerangs_447();
        System.out.print(nob.numberOfBoomerangs(points));
    }

    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        HashMap<Integer,Integer> hm = new HashMap();

        for(int i=0; i<points.length; i++){
            for(int j=0; j<points.length; j++){
                if(i==j) continue;
                int dist = getDist(points[i], points[j]);
                hm.put(dist, hm.getOrDefault(dist,0)+1);
            }

            for(int val:hm.values()){
                result += val*(val-1);
            }
            hm.clear();
        }

        return result;
    }

    private int getDist(int[] a, int[] b){
        int x = a[0] - b[0];
        int y = a[1] - b[1];
        return x*x + y*y;
    }
}
