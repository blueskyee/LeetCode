/**
 * Created by blueskyee on 2016/3/3.
 */
public class QuickSortArray_33 {

    public static void main(String[] args) {
        int[] x = { 9, 2, 4, 7, 3, 7, 10 };
        printArray (x) ;

        int low = 0;
        int high = x.length - 1;
        quickSort(x, low, high);
        printArray (x) ;
    }

    public static void printArray(int[] x) {
        for (int a : x)
            System.out.print(a + " "); System.out. println () ;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high)
            return;
        if(arr==null || arr.length==0)
            return;

        int pivot = arr[low];
        int left = low;
        int right = high;
        while (left < right){
            while (arr[left]<=pivot){
                left++;
            }
            while (arr[right]>pivot){
                right--;
            }
            //swap
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        //swap pivot and middle
        int temp = arr[right];
        arr[right] = arr[low];
        arr[low] = temp;

        quickSort(arr,low,right-1);
        quickSort(arr,right+1,high);
    }
}
