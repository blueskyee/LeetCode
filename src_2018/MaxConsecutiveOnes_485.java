/**
 * Created by henry on 2018/12/28.
 */
public class MaxConsecutiveOnes_485 {
    public static void main(String[] args){
        int[] input = {1,1,0,1,1,1};
        MaxConsecutiveOnes_485 mc = new MaxConsecutiveOnes_485();
        System.out.println(mc.findMaxConsecutiveOnes(input));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int current = 0;

        if(nums == null) return 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                result = Math.max(result, ++current);
            }else{
                current = 0;
            }
        }

        return result;
    }
}
