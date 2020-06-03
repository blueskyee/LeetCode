/**
 * Created by henry on 2018/9/16.
 */
public class MinimumSizeSubarraySum_209 {
    public static void main(String[] args){
        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        MinimumSizeSubarraySum_209 ms = new MinimumSizeSubarraySum_209();
        System.out.println(ms.minSubArrayLen(s, nums));
    }

    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while (sum >= s){
                minLen = Math.min(minLen,i-start+1);
                sum -= nums[start];
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

/*    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        int numslength = nums.length;
        for(int i=0; i<numslength; i++){
            sum += nums[i];
            while(sum >= s){
                minLength = Math.min(minLength, i-start+1);
                sum -= nums[start++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }*/
}
