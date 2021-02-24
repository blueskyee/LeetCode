import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by henry on 2021/2/25.
 */
public class FindKClosestElements_658 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        FindKClosestElements_658 fkc = new FindKClosestElements_658();
        System.out.println(fkc.findClosestElements(arr, 4, 3));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0, hi = arr.length - 1;
        while(hi - lo >= k){
            if(Math.abs(arr[lo] - x) > Math.abs(arr[hi] - x))
                lo++;
            else
                hi--;
        }
        List<Integer> res = new ArrayList<>();
        for(int i = lo; i<= hi; i++){
            res.add(arr[i]);
        }
        return res;
    }
}
