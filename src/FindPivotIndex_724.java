/**
 * Created by blueskyee on 2020/11/8.
 */
public class FindPivotIndex_724 {
    public static void main(String[] args){
        int[] input = {1,7,3,6,5,6};
        FindPivotIndex_724 fp = new FindPivotIndex_724();
        System.out.println(fp.pivotIndex(input));
    }

    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
        int rightSum = 0;
        for(int num:nums){
            rightSum += num;
        }
        int leftSum = 0;
        for(int i=0; i<nums.length; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
