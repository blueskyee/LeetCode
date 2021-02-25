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

/*    public List<Integer> findClosestElements(int[] arr, int k, int x) {
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
    }*/

    //ref: https://leetcode.com/problems/find-k-closest-elements/discuss/106419/O(log-n)-Java-1-line-O(log(n)-%2B-k)-Ruby
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //-------- Main idea behind the binary search algorithm ----------//
        // 1) res will be a consecutive subarray of k size
        // 2) say if we need to pick 4 elems, now we r looking at 5 elem n1, n2, n3, n4, n5
        //    we need to compare two ends: diff(x, n1) and diff(x, n5), the number with bigger diff on the end will be eleminated
        //----------------------------------------------------------------//
        // lo and hi: range of all possible start of subarray with size k + 1, so we could compare both ends
        int lo = 0, hi = arr.length - k - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            // for subarray starting at mid with size k+1, we compare element of two ends to eliminate the loser
            if (Math.abs(x - arr[mid]) > Math.abs(x - arr[mid+k])) {
                lo = mid + 1; // arr[mid] is the one further away from x, eliminate range[lo, mid]
            } else {
                hi = mid - 1; // arr[mid+k] is the one further away, all [mid, hi] will have simiar situation, elimiate them
            }
        }
        // return subarray
        List<Integer> res = new ArrayList(k);
        for (int i = 0; i < k; i++) {
            res.add(arr[lo + i]);
        }
        return res;
    }
}
