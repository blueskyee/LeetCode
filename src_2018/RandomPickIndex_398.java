import java.util.Random;

/**
 * Created by henry on 2018/11/2.
 */
public class RandomPickIndex_398 {
    static public void main(String[] args){
        int[] nums = {1,2,3,3,3};
        Solution sl = new Solution(nums);
        System.out.print(sl.pick(3));
    }
}

class Solution {
    int[] nums;
    Random rand;

    public Solution(int[] nums) {
        this.nums = nums;
        rand = new Random();
    }

    public int pick(int target) {
        int result=-1;
        int count=1;
        for(int i=0; i< nums.length; i++){
            //nextInt(int n) 方法用於獲取一個隨機數，在0(包括)和指定值(不包括)
            if(nums[i]==target && rand.nextInt(count++)==0){
                result = i;
            }
        }
        return result;
    }
}
