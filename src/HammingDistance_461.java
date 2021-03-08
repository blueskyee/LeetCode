/**
 * Created by henry on 2021/3/8.
 */
public class HammingDistance_461 {

    public int hammingDistance(int x, int y) {
        int XOR = x ^ y;
        int dist = 0;
        while(XOR > 0){
            dist += XOR & 1;
            XOR = XOR >> 1;
        }
        return dist;
    }
}
