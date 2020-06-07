/**
 * Created by henry on 2018/10/5.
 */
public class MoveZeroes_283 {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        MoveZeroes_283 mz = new MoveZeroes_283();
        System.out.println(nums);
    }

    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[idx++] = nums[i];
            }
        }
        for(int i=idx; i<nums.length; i++){
            nums[i] = 0;
        }
    }

/*    public void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0)
                nums[pos++] = nums[i];
        }
        for(int i=pos; i<nums.length; i++){
            nums[i] = 0;
        }
    }*/
}
