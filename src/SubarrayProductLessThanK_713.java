/**
 * Created by henry on 2020/12/21.
 */
public class SubarrayProductLessThanK_713 {
    public static void main(String[] args){
        int[] input = {10, 5, 2, 6};
        SubarrayProductLessThanK_713 splk = new SubarrayProductLessThanK_713();
        System.out.println(splk.numSubarrayProductLessThanK(input, 100));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int left=0,res=0;
        int prod = 1;
        for(int right=0; right<nums.length; right++){
            prod *= nums[right];
            while (prod >= k){
                prod /= nums[left++];
            }
            res += (right - left + 1);
        }
        return res;

        //solution1: Time Limit Exceeded
        /*int res = 0;
        int prod = 1;
        for(int i=0; i<nums.length; i++){
            prod = nums[i];
            if(prod < k){
                res++;
            }else{
                continue;
            }
            for(int j=i+1; j<nums.length; j++){
                prod *= nums[j];
                if(prod < k){
                    res++;
                }else{
                    break;
                }
            }
        }
        return res;*/
    }
}
