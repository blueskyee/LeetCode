/**
 * Created by henry on 2018/7/26.
 */
public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        SearchInsertPosition_35 sip = new SearchInsertPosition_35();
        System.out.print(sip.searchInsert(nums, 7));
    }

    public int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            if (nums[i] >= target)
                return i;
            else
                continue;
        }
        return nums.length;
    }
}
