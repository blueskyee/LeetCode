/**
 * Created by henry on 2020/9/24.
 */
public class KthLargestElementinanArray_215 {
    public static void main(String[] args){
        int[] input = {3,2,3,1,2,4,5,5,6};

        KthLargestElementinanArray_215 kea = new KthLargestElementinanArray_215();
        System.out.println(kea.findKthLargest(input, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        //use partition in quicksort to sort the elements in array
        int lo = 0;
        int hi = nums.length -1;
        k = nums.length - k;
        while (lo < hi){
            final int mid = partition(nums, lo, hi);
            if(mid < k){
                lo = mid + 1;
            }else if(mid > k){
                hi = mid - 1;
            }else{
                break;
            }
        }

        return nums[k];
    }

    private int partition(int[] nums, int lo, int hi){
        int i = lo - 1;
        int j = hi;
        while (true){
            while (i < j && nums[++i] < nums[hi]);
            while (i < j &&  nums[--j] > nums[hi]);
            if(i >= j){
                break;
            }
            swap(nums, i, j);
        }

        swap(nums, j, hi);
        return j;
    }

    private void swap(int[] nums, int i, int j){
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
