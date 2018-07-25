/**
 * Created by henry on 2018/7/25.
 */
public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        RemoveElement_27 re = new RemoveElement_27();
        System.out.println(re.removeElement(nums, 2));
    }

    public int removeElement(int[] nums, int val) {
        int curIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[curIdx] = nums[i];
                curIdx++;
            }
        }
        return curIdx;
    }
}
