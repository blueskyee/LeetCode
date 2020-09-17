/**
 * Created by henry on 2020/9/17.
 */
public class ProductofArrayExceptSelf_238 {
    public static void main(String[] args){
        int[] input = {1,2,3,4};

        ProductofArrayExceptSelf_238 pa = new ProductofArrayExceptSelf_238();
        System.out.println(pa.productExceptSelf(input));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = 1;
        for(int i=1; i<nums.length; i++){
            res[i] = res[i-1] * nums[i-1];
        }

        int right = 1;
        for(int i=nums.length-1; i>=0; i--){
            res[i] = res[i] * right;
            right = right * nums[i];
        }

        return res;
    }
}
