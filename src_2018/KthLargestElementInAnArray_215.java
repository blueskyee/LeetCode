import java.util.Arrays;

/**
 * Created by henry on 2018/9/17.
 */
public class KthLargestElementInAnArray_215 {
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};

        KthLargestElementInAnArray_215 kle = new KthLargestElementInAnArray_215();
        System.out.println(kle.findKthLargest(nums, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        //solution 1
        //Arrays.sort(nums);
        //return nums[nums.length-k];

        //solution 2
        k = nums.length - k;
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int j = partition(nums, low, high);
            if(j < k){
                low = j+1;
            }else if(j > k){
                high = j-1;
            }else{
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int lo, int hi){
        int i = lo;
        int j = hi+1;
        while(true){
            while(i<hi && (a[++i]<a[lo]));
            while(j>lo && (a[lo]<a[--j]));

            if(i>=j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
