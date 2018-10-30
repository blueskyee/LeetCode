import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by henry on 2018/10/29.
 */
public class IntersectionOfTwoArrayII_350 {
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        IntersectionOfTwoArrayII_350 iota = new IntersectionOfTwoArrayII_350();
        int[] result = iota.intersect(nums1, nums2);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + ",");
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> temp = new ArrayList<Integer>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                temp.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[temp.size()];
        int idx = 0;
        for(int res:temp){
            result[idx++] = res;
        }

        return result;
    }
}
