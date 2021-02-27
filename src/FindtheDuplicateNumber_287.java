/**
 * Created by henry on 2021/2/27.
 */
public class FindtheDuplicateNumber_287 {
    public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        FindtheDuplicateNumber_287 fd = new FindtheDuplicateNumber_287();
        System.out.println(fd.findDuplicate(nums));
    }

    //https://leetcode.com/problems/find-the-duplicate-number/discuss/72846/My-easy-understood-solution-with-O(n)-time-and-O(1)-space-without-modifying-the-array.-With-clear-explanation.
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (fast != slow){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while (fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
