import java.util.Arrays;

/**
 * Created by henry on 2019/1/2.
 */
public class RelativeRanks_506 {
    public static void main(String[] args){
        int[] input = {10, 3, 8, 9, 4};
        RelativeRanks_506 rr = new RelativeRanks_506();
        System.out.println(rr.findRelativeRanks(input));
    }

    public String[] findRelativeRanks(int[] nums) {
        Integer[] index = new Integer[nums.length];
        for(int i=0; i<index.length; i++){
            index[i] = i;
        }
        Arrays.sort(index, (a,b) -> (nums[b]-nums[a]));

        String[] res = new String[nums.length];
        for(int i=0; i< nums.length; i++){
            if(i==0){
                res[index[i]] = "Gold Medal";
            }else if(i==1){
                res[index[i]] = "Silver Medal";
            }else if(i==2){
                res[index[i]] = "Bronze Medal";
            }else{
                res[index[i]] = (i+1) + "";
            }
        }

        return res;
    }
}
