/**
 * Created by henry on 2021/2/9.
 */
public class SingleElementinaSortedArray_540 {

    public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            if(mid % 2 == 0){
                if(nums[mid] == nums[mid + 1]){
                    lo = mid + 2;
                }else{
                    hi = mid;
                }
            }else{
                if(nums[mid] == nums[mid + 1]){
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            }
        }
        return nums[lo];
    }
}
