/**
 * Created by henry on 2021/1/31.
 */
public class SearchinRotatedSortedArray_33 {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        SearchinRotatedSortedArray_33 srsa = new SearchinRotatedSortedArray_33();
        System.out.println(srsa.search(nums, 0));
    }

    public int search(int[] nums, int target) {
        //find the smallest element in nums
        int lo = 0, hi = nums.length - 1;
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] > nums[hi])
                lo = mid + 1;
            else
                hi = mid;
        }
        //search by binary serach
        int rot = lo;
        lo = 0;
        hi = nums.length - 1;
        while (lo <= hi){
            int mid = (lo + hi) / 2;
            int realMid = (rot + mid) % nums.length;
            if(nums[realMid] > target)
                hi = mid - 1;
            else if (nums[realMid] < target)
                lo = mid + 1;
            else
                return realMid;
        }
        return -1;
    }
}
