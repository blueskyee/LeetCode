/**
 * Created by henry on 2020/10/25.
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args){
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesfromSortedArray_26 rdsa = new RemoveDuplicatesfromSortedArray_26();
        int len = rdsa.removeDuplicates(input);
        for(int i=0; i<len; i++){
            System.out.print(input[i] + ",");
        }
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length < 2)
            return nums.length;
        int idx = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[idx++] = nums[i];
            }
        }

        return idx;
    }
}
