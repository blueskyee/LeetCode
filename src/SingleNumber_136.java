import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by henry on 2018/8/31.
 */
public class SingleNumber_136 {
    public static void main(String[] args){
        int[] input = {4,1,2,1,2};
        SingleNumber_136 sn = new SingleNumber_136();
        System.out.println(sn.singleNumber(input));
    }

    public int singleNumber(int[] nums) {
        //0 ^ N = N
        //N ^ N = 0
        for(int i=1; i<nums.length; i++){
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];
    }
}
