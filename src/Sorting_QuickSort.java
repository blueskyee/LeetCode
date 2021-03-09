/**
 * Created by henry on 2021/3/9.
 */
public class Sorting_QuickSort {
    public static void main(String[] args){
        int[] arr = {5,3,1,7,10,8,12,16,4};
        Sorting_QuickSort qs = new Sorting_QuickSort();
        qs.quick(arr, 0, arr.length - 1);
        System.out.println(arr);
    }

    public void quick(int[] arr, int lo, int hi){
        if(lo < hi){
            int p = partition(arr, lo, hi);
            quick(arr, lo, p - 1);
            quick(arr, p + 1, hi);
        }
    }

    private int partition(int[] arr, int lo, int hi){
        int pivot = arr[hi];
        int i = lo;
        for(int j = lo; j < hi; j++){
            if(arr[j] < pivot){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, hi);
        return i;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
