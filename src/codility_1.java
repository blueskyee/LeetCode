import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry on 2020/11/13.
 */
public class codility_1 {

    public static void main(String[] args){
        Solution sl = new Solution();
        sl.solution(new int[]{1,2,-3});
    }


}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 11
        int res = 1;
        Arrays.sort(A);

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<A.length; i++){
            set.add(A[i]);
        }
        for(int i=0; i<A.length; i++){
            if(A[i] <= 0){
                continue;
            }else{
                if(!set.contains(A[i] + 1)){
                    res = A[i] + 1;
                    break;
                }
            }
        }

        return res;
    }
}
